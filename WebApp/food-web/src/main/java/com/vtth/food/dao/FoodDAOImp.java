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
        return null;
    }

    public TblFood getFood(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    /*
     * DEMO FOR DAO
     */
    public List<TblFood> getFood() {
        return utils.fetchAll(TblFood.class);
    }

    public TblFood updateFood(TblFood newFodd) {
        // TODO Auto-generated method stub
        return null;
    }

    public void deleteFood(int id) {
        // TODO Auto-generated method stub

    }

    public TblFood increaseNum(int visitNum) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<TblFood> searchByMaterial(String material, int start, int limit) {
        // TODO Auto-generated method stub
        return null;
    }

}
