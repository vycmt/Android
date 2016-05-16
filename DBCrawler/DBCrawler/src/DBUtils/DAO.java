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

/**
 *
 * @author SONY
 */
public class DAO implements Serializable{
    
    
    public boolean addFood (FoodDTO food){
        
        return false;
    }
    
    public int getFoodId(String foodName){
        
        return 0;
    }
    
    public int getFoodDetailId(int foodId){
        
        return 0;
    }
    
    public int getCategoryId(String categoryName){
        
        return 0;
    }
    
    public boolean addCategory(CategoryDTO category){
        
        return false;
    }
    
    public boolean addFoodDetail (FoodDetailDTO foodDetail){
        
        return false;
    }
    
    public boolean updateFood(FoodDTO food, int foodId){
        
        return false;
    }
    
    public boolean updateFoodDetail(FoodDetailDTO food){
        
        return false;
    }
}
