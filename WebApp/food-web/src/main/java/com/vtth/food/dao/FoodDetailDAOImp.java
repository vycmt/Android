/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vtth.food.entity.TblFooddetail;

/**
 * @author SONY
 *
 */
@Repository // bắt buộc phải có
public class FoodDetailDAOImp implements FoodDetailDAO {

    // Constructor bắt buộc phải có
    
    
    // Khai báo Hibernate Utils
    
    public Serializable createFoodDetail(TblFooddetail newFoodDetail) {
        // TODO Auto-generated method stub
        return null;
    }

    public TblFooddetail getFoodDetail(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<TblFooddetail> getFoodDetail() {
        // TODO Auto-generated method stub
        return null;
    }

    public void deleteFoodDetail(int id) {
        // TODO Auto-generated method stub
        
    }

    public TblFooddetail updateFoodDetail(TblFooddetail newFoodDetail) {
        // TODO Auto-generated method stub
        return null;
    }

}
