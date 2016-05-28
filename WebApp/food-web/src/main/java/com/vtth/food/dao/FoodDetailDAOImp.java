/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import com.vtth.food.entity.TblFooddetail;
import com.vtth.food.util.HibernateUtil;

/**
 * @author MHVTu
 *
 */
@Repository // bắt buộc phải có
public class FoodDetailDAOImp implements FoodDetailDAO {

    // Constructor bắt buộc phải có
    public FoodDetailDAOImp() {
        System.out.println("FoodDetailDAOImp()");
    }
    
    // Khai báo Hibernate Utils
    private HibernateUtil utils;
    
    public Serializable createFoodDetail(TblFooddetail newFoodDetail) {
        // TODO Auto-generated method stub
        return utils.create(newFoodDetail);
    }

    public TblFooddetail getFoodDetail(int id) {
        // TODO Auto-generated method stub
        return utils.fetchById(id, TblFooddetail.class);
    }

    public List<TblFooddetail> getFoodDetail() {
        // TODO Auto-generated method stub
        return utils.fetchAll(TblFooddetail.class);
    }

    public void deleteFoodDetail(int id) {
        // TODO Auto-generated method stub
        
    }

    public TblFooddetail updateFoodDetail(TblFooddetail newFoodDetail) {
        // TODO Auto-generated method stub
        return utils.update(newFoodDetail);
    }

}
