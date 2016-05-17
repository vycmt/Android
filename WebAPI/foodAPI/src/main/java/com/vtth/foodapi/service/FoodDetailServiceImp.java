package com.vtth.foodapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.vtth.foodapi.dao.FoodDetailDAO;
import com.vtth.foodapi.entity.TblFooddetail;

@Service
@Transactional
public class FoodDetailServiceImp implements FoodDetailService {

    public FoodDetailServiceImp() {
        System.out.println("FoodDetailServiceImp()");
    }
    
    @Autowired
    private FoodDetailDAO foodDetailDao;
    
    public TblFooddetail getFood(int id) {
        return foodDetailDao.getFood(id);
    }

}
