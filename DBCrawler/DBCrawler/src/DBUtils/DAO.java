/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBUtils;

import DTO.CategoryDTO;
import DTO.FoodDTO;
import DTO.FoodDetailDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author SONY
 */
public class DAO implements Serializable{
    
    
    public boolean addFood (FoodDTO food){
        Connection con = DBUtils.makeConnection();
        PreparedStatement stm = null;
        if(con!= null) {
            String sql = "INSERT INTO 'fooddb' , 'tbl_food' "
                    + "('FoodName', 'Description', 'ListMaterial', 'Images', 'VisitNum', CategoryID' )"
                    + "VALUES (?,?,?,?,?,?)";
            try {
                stm = con.prepareStatement(sql);
                stm.setString(1, food.getFoodName());
                stm.setString(2, food.getDescription());
                stm.setString(3, food.getListMaterial());
                stm.setString(4, food.getImages());
                stm.setInt(5, food.getVisitNum());
                stm.setInt(6, food.getCategoryID());
                int row = stm.executeUpdate();
                if (row > 0) {
                    System.out.println("INFO: Insert Food Success | FoodName: " + food.getFoodName());
                    return true;
                }
            } catch (Exception e) {
                System.out.println("ERROR: Insert Food Fail | FoodName: " + food.getFoodName());
                e.printStackTrace();
            }
            finally {
                try {
                    if (stm != null) {
                        stm.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println("ERROR: Close Connection Fail !");
                    ex.printStackTrace();
                }

            }
        }
        
        return false;
    }
    
    public int getFoodId(String foodName){
        Connection con = DBUtils.makeConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        if (con != null) {
            String sql = "select FoodID from tbl_food where FoodName=?";
            try {
                stm = con.prepareStatement(sql);
                stm.setString(1, foodName);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getInt("FoodID");
                }
            } catch (SQLException ex) {
                System.out.println("ERROR: Get FoodID Fail | FoodName: " + foodName);
                ex.printStackTrace();
            } finally {

                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (stm != null) {
                        stm.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println("ERROR: Close Connection Fail !");
                    ex.printStackTrace();
                }
            }
        }
        return -1;
    }
    
    public int getFoodDetailId(int foodID){
        Connection con = DBUtils.makeConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        if (con != null) {
            String sql = "select FoodID from tbl_fooddetail where FoodID=?";
            try {
                stm = con.prepareStatement(sql);
                stm.setInt(1, foodID);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getInt("FoodID");
                }
            } catch (SQLException ex) {
                System.out.println("ERROR: Get FoodDetail Fail | FoodID: " + foodID);
                ex.printStackTrace();
            } finally {

                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (stm != null) {
                        stm.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println("ERROR: Close Connection Fail !");
                    ex.printStackTrace();
                }
            }
        }
        return -1;
    }
    
    public int getCategoryId(String categoryName){
        Connection con = DBUtils.makeConnection();
        PreparedStatement stm = null;
        ResultSet rs = null;
        if (con != null) {
            String sql = "select CategoryID from tbl_category where CategoryName=?";
            try {
                stm = con.prepareStatement(sql);
                stm.setString(1, categoryName);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getInt("CategoryID");
                }
            } catch (SQLException ex) {
                System.out.println("ERROR: Get Category Fail | Category: " + categoryName);
                ex.printStackTrace();
            } finally {

                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (stm != null) {
                        stm.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println("ERROR: Close Connection Fail !");
                    ex.printStackTrace();
                }
            }
        }
        return -1;
    }
    
    public boolean addCategory(CategoryDTO category){
        Connection con = DBUtils.makeConnection();
        PreparedStatement stm = null;
        if (con != null) {
            String sql = "INSERT INTO `fooddb`.`tbl_category` (`CategoryName`) VALUES (?);";
            try {
                stm = con.prepareStatement(sql);
                stm.setString(1, category.getCategoryName());
                int row = stm.executeUpdate();
                if (row > 0) {
                    System.out.println("INFO: Insert Category Success | CategoryName: " + category.getCategoryName());
                    return true;
                }
            } catch (SQLException e) {
                System.out.println("ERROR: Insert Category Fail | CategoryName: " + category.getCategoryName());
                e.printStackTrace();
            } finally {
                try {
                    if (stm != null) {
                        stm.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println("ERROR: Close Connection Fail !");
                    ex.printStackTrace();
                }

            }

        }
        return false;
    }
    
    public boolean addFoodDetail (FoodDetailDTO foodDetail){
        Connection con = DBUtils.makeConnection();
        PreparedStatement stm = null;
        if (con != null) {
            String sql = "INSERT INTO `fooddb`.`tbl_fooddetail` (`FoodID`, `MaterialDetail`, `Tutorial`, `Source`) "
                    + "VALUES (?, ?, ?, ?, ?);";
            try {
                stm = con.prepareStatement(sql);
                stm.setInt(1, foodDetail.getFoodID());
                stm.setString(2, foodDetail.getMaterialDetail());
                stm.setString(3, foodDetail.getTutorial());
                stm.setString(4, foodDetail.getSource());
                int row = stm.executeUpdate();
                if (row > 0) {
                    System.out.println("INFO: Insert FoodDetail Success | FoodID: " + foodDetail.getFoodID());
                    return true;
                }
            } catch (SQLException e) {
                System.out.println("ERROR: Insert FoodDetail Fail | FoodDetailID: " + foodDetail.getFoodID());
                e.printStackTrace();
            } finally {
                try {
                    if (stm != null) {
                        stm.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println("ERROR: Close Connection Fail !");
                    ex.printStackTrace();
                }

            }

        }
        return false;
    }
    
    public boolean updateFood(FoodDTO food, int foodID){
        Connection con = DBUtils.makeConnection();
        PreparedStatement stm = null;
        if (con != null) {
            String sql = "UPDATE `fooddb`.`tbl_food` SET "
                    + "`FoodName`=?, `Description`=?, `ListMaterial`=?, `Images`=?, `VisitNum`=?,  `CategoryID`=? "
                    + "WHERE `FoodID`=?;";
            try {
                stm = con.prepareStatement(sql);
                stm.setString(1, food.getFoodName());
                stm.setString(2, food.getDescription());
                stm.setString(3, food.getListMaterial());
                stm.setString(4, food.getImages());
                stm.setInt(5, food.getVisitNum());
                stm.setInt(6, food.getCategoryID());
                stm.setInt(7, foodID);
                int row = stm.executeUpdate();
                if (row > 0) {
                    System.out.println("INFO: Update Food Success | FoodName: " + food.getFoodName());
                    return true;
                }
            } catch (SQLException e) {
                System.out.println("ERROR: Update Food Fail | FoodName: " + food.getFoodName());
                e.printStackTrace();
            } finally {
                try {
                    if (stm != null) {
                        stm.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println("ERROR: Close Connection Fail !");
                    ex.printStackTrace();
                }

            }

        }
        return false;
    }
    
    public boolean updateFoodDetail(FoodDetailDTO foodDetail){
        Connection con = DBUtils.makeConnection();
        PreparedStatement stm = null;
        if (con != null) {
            String sql = "UPDATE `fooddb`.`tbl_fooddetail` SET "
                    + "`MaterialDetail`=?, `Tutorial`=?, `Source`=? "
                    + "WHERE `FoodID`=?;";
            try {
                stm = con.prepareStatement(sql);
                stm.setString(1, foodDetail.getMaterialDetail());
                stm.setString(2, foodDetail.getTutorial());
                stm.setString(3, foodDetail.getSource());
                stm.setInt(4, foodDetail.getFoodID());
                int row = stm.executeUpdate();
                if (row > 0) {
                    System.out.println("INFO: Update FoodDetail Success | FoodID: " + foodDetail.getFoodID());
                    return true;
                }
            } catch (SQLException e) {
                System.out.println("ERROR: Update FoodDetail Fail | FoodDetailID: " + foodDetail.getFoodID());
                e.printStackTrace();
            } finally {
                try {
                    if (stm != null) {
                        stm.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException ex) {
                    System.out.println("ERROR: Close Connection Fail !");
                    ex.printStackTrace();
                }

            }

        }
        return false;
    }
}
