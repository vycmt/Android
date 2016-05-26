package com.vtth.food.dto;

import java.io.Serializable;

import com.vtth.food.entity.TblFooddetail;

// Tạo DTO
// Nhớ phải implement Serializable, trong Entity có bao nhiêu field thì bên này có bấy nhiêu
//field trừ private TblFooddetail tblFooddetail; 
//Tạo contrustuctor, và get,set cho từng field

public class FoodDTO implements Serializable {
        
    private String foodName;
    
    
    /**
     * Constructor (bắt buộc phải có)
     */
    public FoodDTO() {
        // TODO Auto-generated constructor stub
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    
    
}
