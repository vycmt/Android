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
 * @author SONY
 *
 */
@Repository // bắt buộc phải có
public class FoodDAOImp implements FoodDAO {

    public FoodDAOImp() {
        // TODO Auto-generated constructor stub FOR DEBUGGING
        System.out.println("FoodDAOImp()");
    }

    @Autowired
    private HibernateUtil utils;

    public Serializable createFood(TblFood newFood) {
        // TODO Auto-generated method stub
        return utils.create(newFood);
    }

    public TblFood getFood(int id) {
        return utils.fetchById(id, TblFood.class);
    }

    /*
     * DEMO FOR DAO
     */
    public List<TblFood> getFood() {
        return utils.fetchAll(TblFood.class);
    }

    public TblFood updateFood(TblFood newFood) {
        return utils.update(newFood);
    }

    public void deleteFood(int id) {
        // TODO Auto-generated method stub

    }

    // Chua lai khong implement
    public TblFood increaseNum(int visitNum) {
        // TODO Auto-generated method stub
        return null;
    }

    // Chua lai khong implement
    public List<TblFood> searchByMaterial(String material, int start, int limit) {
        // TODO Auto-generated method stub
        return null;
    }

}
