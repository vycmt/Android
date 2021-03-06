/**
 * 
 */
package com.vtth.foodapi.dao;

import java.util.List;

import com.vtth.foodapi.entity.TblFood;

public interface FoodDAO {

    public TblFood getFood(int id);
    public List<TblFood> searchByMaterial(String materials, int start, int limit);
    public TblFood increaseVisistNum(int id);
}
