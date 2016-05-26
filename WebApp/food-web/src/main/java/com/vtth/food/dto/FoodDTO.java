package com.vtth.food.dto;

import java.io.Serializable;

import com.vtth.food.entity.TblCategory;
import com.vtth.food.entity.TblFooddetail;

// Tạo DTO
// Nhớ phải implement Serializable, trong Entity có bao nhiêu field thì bên này có bấy nhiêu
//field trừ private TblFooddetail tblFooddetail; 
//Tạo contrustuctor, và get,set cho từng field

public class FoodDTO implements Serializable {
        
    private int foodId; 
    private String foodName;
    private String description;
    private String listMaterial;
    private String images;
    private int visitNum;
      
    public FoodDTO() {
        // TODO Auto-generated constructor stub
    }

    public FoodDTO(int foodId, String foodName, String description, String listMaterial, String images, int visitNum) {
        super();
        this.foodId = foodId;
        this.foodName = foodName;
        this.description = description;
        this.listMaterial = listMaterial;
        this.images = images;
        this.visitNum = visitNum;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getListMaterial() {
        return listMaterial;
    }

    public void setListMaterial(String listMaterial) {
        this.listMaterial = listMaterial;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public int getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(int visitNum) {
        this.visitNum = visitNum;
    }
    
}
