/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vtth.food.dao.FoodDetailDAO;
import com.vtth.food.entity.TblFood;
import com.vtth.food.entity.TblFooddetail;

/**
 * @author KMF
 *
 */
@Service
@Transactional
public class FoodDetailServiceImp implements FoodDetailService {

    @Autowired
    FoodDetailDAO foodDetailDAO;

    public FoodDetailServiceImp() {
        System.out.println("FoodDetailServiceImp()");
    }

    public Serializable createFoodDetail(TblFooddetail newFoodDetail) {
        return foodDetailDAO.createFoodDetail(newFoodDetail);
    }

    public TblFooddetail getFoodDetail(int id) {
        return foodDetailDAO.getFoodDetail(id);
    }

    public List<TblFooddetail> getFoodDetail() {
        return foodDetailDAO.getFoodDetail();
    }

    public void deleteFoodDetail(int id) {
        foodDetailDAO.deleteFoodDetail(id);
    }

    public TblFooddetail updateFoodDetail(TblFooddetail newFoodDetail) {
        return foodDetailDAO.updateFoodDetail(newFoodDetail);
    }

}
