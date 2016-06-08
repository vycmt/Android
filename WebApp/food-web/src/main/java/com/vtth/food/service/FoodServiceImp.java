/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtth.food.dao.FoodDAO;
import com.vtth.food.entity.TblFood;

@Service
@Transactional
public class FoodServiceImp implements FoodService {

    @Autowired
    FoodDAO foodDAO;

    public FoodServiceImp() {
        System.out.println("FoodServiceImp()");
    }

    public Serializable createFood(TblFood newFood) {
        return foodDAO.createFood(newFood);
    }

    public TblFood getFoodId(int id) {
        return foodDAO.getFood(id);
    }

    public List<TblFood> getFood() {
        return foodDAO.getFood();
    }

    public TblFood updateFood(TblFood newFodd) {
        return foodDAO.updateFood(newFodd);
    }

    public void deleteFood(int id) {
        foodDAO.deleteFood(id);
    }

    public TblFood increaseNum(int visitNum) {
        return foodDAO.increaseNum(visitNum);
    }

    public TblFood getFoodId(String foodID) {
        // TODO Auto-generated method stub
        return null;
    }

}
