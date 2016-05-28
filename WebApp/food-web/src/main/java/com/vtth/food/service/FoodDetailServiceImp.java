/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vtth.food.entity.TblFood;
import com.vtth.food.entity.TblFooddetail;

/**
 * @author SONY
 *
 */
@Service
@Transactional
public class FoodDetailServiceImp implements FoodDetailService {

    // khai báo thêm FoodDetailDAO + @Autowired
    
    // bắt buộc
    public FoodDetailServiceImp() {
        System.out.println("FoodDetailServiceImp()");
    }

    public Serializable createFoodDetail(TblFooddetail newFoodDetail) {
        // TODO Auto-generated method stub
        return null;
    }

    public TblFooddetail getFoodDetail(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<TblFooddetail> getFoodDetail() {
        // TODO Auto-generated method stub
        return null;
    }

    public void deleteFoodDetail(int id) {
        // TODO Auto-generated method stub
        
    }

    public TblFooddetail updateFoodDetail(TblFooddetail newFoodDetail) {
        // TODO Auto-generated method stub
        return null;
    }
    
   
}
