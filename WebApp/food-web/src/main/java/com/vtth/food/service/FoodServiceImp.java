/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtth.food.dao.FoodDAO;
import com.vtth.food.entity.TblFood;

@Service
@Transactional
public class FoodServiceImp implements FoodService {

    public FoodServiceImp() {
        System.out.println("FoodServiceImpl()");
    }

    @Autowired
    private FoodDAO foodDAO;

    public List<TblFood> getFood() {
        return foodDAO.getFood();
    }

    public TblFood getFoodID(int ID) {
        // TODO Auto-generated method stub
        return foodDAO.getFoodID(ID);
    }

    public TblFood updateFood(TblFood newfood) {
        // TODO Auto-generated method stub
        return foodDAO.updateFood(newfood);
    }

    public void deleteFood(int ID) {
        // TODO Auto-generated method stub
        foodDAO.deleteFood(ID);
    }

    public Serializable createFood(TblFood newFood) {
        // TODO Auto-generated method stub
        return foodDAO.createFood(newFood);
    }

    public List<TblFood> getFoodUser(String username) {
        // TODO Auto-generated method stub
        List<TblFood> allFood = getFood();
        List<TblFood> foodUser = new ArrayList<TblFood>();
        for (TblFood tblFood : allFood) {
            if (tblFood.getUserID().equals(username)) {
                foodUser.add(tblFood);
            }

        }
        return foodUser;
    }

    public TblFood incrVisitNum(int id) {
        return foodDAO.incrVisitNum(id);
    }

}
