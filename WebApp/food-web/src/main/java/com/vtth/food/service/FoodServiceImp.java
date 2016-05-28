/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vtth.food.dao.FoodDAO;
import com.vtth.food.entity.TblFood;

/**
 * @author KMF
 *
 */
@Service
@Transactional
public class FoodServiceImp implements FoodService {

    // khai bao FoodDAO + @Autowired
    @Autowired
    FoodDAO foodDAO;
    
    public FoodServiceImp() {
        // TODO Auto-generated constructor stub
        System.out.println("FoodServiceImp()");
    }

    public Serializable createFood(TblFood newFood) {
        // TODO Auto-generated method stub
        return foodDAO.createFood(newFood);
    }

    public TblFood getFoodId(int id) {
        // TODO Auto-generated method stub
        return foodDAO.getFood(id);
    }

    public List<TblFood> getFood() {
        // TODO Auto-generated method stub
        return foodDAO.getFood();
    }

    public TblFood updateFood(TblFood newFodd) {
        // TODO Auto-generated method stub
        return foodDAO.updateFood(newFodd);
    }

    public void deleteFood(int id) {
        // TODO Auto-generated method stub
        foodDAO.deleteFood(id);
    }

    // để t implement
    public TblFood increaseNum(int visitNum) {
        // TODO Auto-generated method stub
        return null;
    }

}
