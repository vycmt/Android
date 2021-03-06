package com.vtth.foodapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vtth.foodapi.entity.TblFood;
import com.vtth.foodapi.entity.TblFooddetail;
import com.vtth.foodapi.util.HibernateUtil;

@Repository
public class FoodDetailDAOImp implements FoodDetailDAO {

    public FoodDetailDAOImp() {
        System.out.println("FoodDetailDAOImp()");
    }
    
    @Autowired
    private HibernateUtil hibernateUtil;
    
    @Autowired
    private FoodDAO foodDao;
    
    public TblFooddetail getFood(int id) {
       TblFood food = foodDao.increaseVisistNum(id);
       if (food == null){
           System.out.println("Error happen at getFood() in FoodDetailDAOImp");
       }
        return hibernateUtil.fetchById(id, TblFooddetail.class);
    }

}
