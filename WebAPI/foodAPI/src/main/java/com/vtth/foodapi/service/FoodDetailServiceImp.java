package com.vtth.foodapi.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtth.foodapi.dao.FoodDetailDAO;
import com.vtth.foodapi.entity.TblFooddetail;

@Service
@Transactional
public class FoodDetailServiceImp implements FoodDetailService {

    public FoodDetailServiceImp() {
        System.out.println("FoodDetailServiceImpl()");
    }

    @Autowired
    private FoodDetailDAO foodDetailDAO;

    public TblFooddetail getFood(int id) {
        return foodDetailDAO.getFood(id);
    }

}
