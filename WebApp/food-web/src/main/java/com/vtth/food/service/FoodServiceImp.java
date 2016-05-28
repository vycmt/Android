/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vtth.food.entity.TblFood;

/**
 * @author SONY
 *
 */
@Service
@Transactional
public class FoodServiceImp implements FoodService {

    // khai bao FoodDAO + @Autowired

    public FoodServiceImp() {
        // TODO Auto-generated constructor stub
        System.out.println("FoodServiceImp()");
    }

    public Serializable createFood(TblFood newFood) {
        // TODO Auto-generated method stub
        return null;
    }

    public TblFood getFoodId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<TblFood> getFood() {
        // TODO Auto-generated method stub
        return null;
    }

    public TblFood updateFood(TblFood newFodd) {
        // TODO Auto-generated method stub
        return null;
    }

    public void deleteFood(int id) {
        // TODO Auto-generated method stub

    }

    // để t implement
    public TblFood increaseNum(int visitNum) {
        // TODO Auto-generated method stub
        return null;
    }

}
