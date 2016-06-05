package com.vtth.foodapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vtth.foodapi.dao.FoodDAO;
import com.vtth.foodapi.entity.TblFood;

@Service
@Transactional
public class FoodServiceImp implements FoodService {

    public FoodServiceImp() {
        System.out.println("FoodServiceImp()");
    }

    @Autowired
    private FoodDAO foodDao;

    public TblFood getFood(int id) {
        return foodDao.getFood(id);
    }

    public List<TblFood> searchByMaterial(String materials, int start, int limit) {
        return foodDao.searchByMaterial(materials, start, limit);
    }

}
