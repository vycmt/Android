/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vtth.food.entity.TblFooddetail;
import com.vtth.food.util.HibernateUtil;

/**
 * @author MHVTu
 *
 */
@Repository
public class FoodDetailDAOImp implements FoodDetailDAO {

    public FoodDetailDAOImp() {
        System.out.println("FoodDetailDAOImp()");
    }
    
    @Autowired
    private HibernateUtil utils;
    
    public Serializable createFoodDetail(TblFooddetail newFoodDetail) {
        return utils.create(newFoodDetail);
    }

    public TblFooddetail getFoodDetail(int id) {
        return utils.fetchById(id, TblFooddetail.class);
    }

    public List<TblFooddetail> getFoodDetail() {
        return utils.fetchAll(TblFooddetail.class);
    }

    public void deleteFoodDetail(int id) {
        utils.delete(id, TblFooddetail.class);
    }

    public TblFooddetail updateFoodDetail(TblFooddetail newFoodDetail) {
        return utils.update(newFoodDetail);
    }

}
