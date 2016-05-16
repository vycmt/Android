/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DTO;

/**
 *
 * @author SONY
 */
public class FoodDTO {
    private String foodName;
    private String description;
    private String images;
    private String listMaterial;
    private int categoryID;

    public FoodDTO() {
    }

    public FoodDTO(String foodName, String description, String images, String listMaterial, int categoryID) {
        this.foodName = foodName;
        this.description = description;
        this.images = images;
        this.listMaterial = listMaterial;
        this.categoryID = categoryID;
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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getListMaterial() {
        return listMaterial;
    }

    public void setListMaterial(String listMaterial) {
        this.listMaterial = listMaterial;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
    
    
}
