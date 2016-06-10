/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import com.vtth.food.entity.TblFood;

public interface FoodDAO {

    public Serializable createFood(TblFood newFood);
    public List<TblFood> getFood();
    public TblFood getFoodID(int ID);
    public TblFood updateFood(TblFood newfood);
    public void deleteFood(int ID);
    public TblFood incrVisitNum(int id);
    List<TblFood> searchByMaterial(String materials, int start, int limit);
}
