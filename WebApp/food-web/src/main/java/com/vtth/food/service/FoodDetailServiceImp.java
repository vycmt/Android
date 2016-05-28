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
    // khai báo thêm FoodDetailDAO + @Autowired
    FoodDetailDAO foodDetailDAO;
    // bắt buộc
    public FoodDetailServiceImp() {
        System.out.println("FoodDetailServiceImp()");
    }

    public Serializable createFoodDetail(TblFooddetail newFoodDetail) {
        // TODO Auto-generated method stub
        return foodDetailDAO.createFoodDetail(newFoodDetail);
    }

    public TblFooddetail getFoodDetail(int id) {
        // TODO Auto-generated method stub
        return foodDetailDAO.getFoodDetail(id);
    }

    public List<TblFooddetail> getFoodDetail() {
        // TODO Auto-generated method stub
        return foodDetailDAO.getFoodDetail();
    }

    public void deleteFoodDetail(int id) {
        // TODO Auto-generated method stub
        foodDetailDAO.deleteFoodDetail(id);
    }

    public TblFooddetail updateFoodDetail(TblFooddetail newFoodDetail) {
        // TODO Auto-generated method stub
        return foodDetailDAO.updateFoodDetail(newFoodDetail);
    }
    
   
}
