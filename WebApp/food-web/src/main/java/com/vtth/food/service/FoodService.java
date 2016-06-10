/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import com.vtth.food.entity.TblFood;

public interface FoodService {

    public Serializable createFood(TblFood newFood);
    public List<TblFood> getFood();
    public List<TblFood> getFoodUser(String username);
    public TblFood getFoodID(int ID);
    public TblFood updateFood(TblFood newfood);
    public void deleteFood(int ID);
    public TblFood incrVisitNum(int id);
}
