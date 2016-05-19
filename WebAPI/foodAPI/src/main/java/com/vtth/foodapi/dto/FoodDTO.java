/**
 * 
 */
package com.vtth.foodapi.dto;

import java.io.Serializable;

import com.vtth.foodapi.entity.TblFood;

/**
 * @author SONY
 *
 */
public class FoodDTO implements Serializable {

    private int foodId;
    private String foodName;
    private String description;
    private String images;
    private String abc;
    private String xyz;
    private String fpt;
    private String aaaaaaa;

    public FoodDTO() {
        // TODO Auto-generated constructor stub
    }

    public FoodDTO(int foodId, String foodName, String description, String images) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.description = description;
        this.images = images;
    }

    public FoodDTO(TblFood food) {
        this.foodId = food.getFoodId();
        this.foodName = food.getFoodName();
        this.description = food.getDescription();
        this.images = food.getImages();
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

    public String getXyz() {
		return xyz;
	}

	public void setXyz(String xyz) {
		this.xyz = xyz;
	}

	public String getFpt() {
		return fpt;
	}

	public void setFpt(String fpt) {
		this.fpt = fpt;
	}

	public FoodDTO(String images) {
        super();
        this.images = images;
    }

}
