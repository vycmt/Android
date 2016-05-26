/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import com.vtth.food.entity.TblFood;

/**
 * @author SONY
 *
 */
public interface FoodDAO {
        
    public Serializable createFood(TblFood newFood);
    public TblFood getFood (int id);
    public List<TblFood> getFood();
    public TblFood updateFood(TblFood newFodd);
    public void deleteFood(int id);
    public TblFood increaseNum (int visitNum);
    public List<TblFood> searchByMaterial(String material, int start, int limit);
}
