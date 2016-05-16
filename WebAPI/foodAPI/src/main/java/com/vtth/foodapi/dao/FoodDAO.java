/**
 * 
 */
package com.vtth.foodapi.dao;

import java.util.List;

import com.vtth.foodapi.entity.TblFood;

/**
 * @author SONY
 *
 */
public interface FoodDAO {

       public TblFood getFood(int id);
       public List<TblFood> searchByMaterial(String material);
}
