/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import com.vtth.food.entity.TblFooddetail;

/**
 * @author SONY
 *
 */
public interface FoodDetailDAO {

    public Serializable createFoodDetail(TblFooddetail newFoodDetail);
    public TblFooddetail getFoodDetail(int id);
    public List<TblFooddetail> getFoodDetail();
    public void deleteFoodDetail(int id);
    public TblFooddetail updateFoodDetail(TblFooddetail newFoodDetail);
}
