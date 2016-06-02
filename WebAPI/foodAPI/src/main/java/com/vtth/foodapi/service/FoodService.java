/**
 * 
 */
package com.vtth.foodapi.service;

import java.util.List;

import com.vtth.foodapi.entity.TblFood;

public interface FoodService {

    public TblFood getFood(int id);

    public List<TblFood> searchByMaterial(String materials, int start, int limit);
}
