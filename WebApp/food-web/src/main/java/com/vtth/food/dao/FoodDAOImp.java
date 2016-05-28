/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vtth.food.entity.TblFood;
import com.vtth.food.util.HibernateUtil;

/**
 * @author KMF
 *
 */
@Repository
public class FoodDAOImp implements FoodDAO {

    public FoodDAOImp() {
        System.out.println("FoodDAOImp()");
    }

    @Autowired
    private HibernateUtil utils;

    public Serializable createFood(TblFood newFood) {
        return utils.create(newFood);
    }

    public TblFood getFood(int id) {
        return utils.fetchById(id, TblFood.class);
    }

    public List<TblFood> getFood() {
        return utils.fetchAll(TblFood.class);
    }

    public TblFood updateFood(TblFood newFood) {
        return utils.update(newFood);
    }

    public void deleteFood(int id) {
        utils.delete(id, TblFood.class);
    }

    public TblFood increaseNum(int visitNum) {
        return null;
    }

    public List<TblFood> searchByMaterial(String material, int start, int limit) {
        return null;
    }

}
