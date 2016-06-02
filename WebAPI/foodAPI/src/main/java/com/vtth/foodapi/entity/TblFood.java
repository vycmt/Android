package com.vtth.foodapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_food")
public class TblFood implements java.io.Serializable {

    private static final long serialVersionUID = -7988799579036225137L;

    private int foodId;
    private String foodName;
    private String description;
    private String listMaterial;
    private String images;
    private int visitNum;
    private int categoryId;

    public TblFood() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "FoodID")
    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    @Column(name = "FoodName", nullable = false, length = 500)
    public String getFoodName() {
        return this.foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Column(name = "Description", length = 5000)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "ListMaterial", length = 4000)
    public String getListMaterial() {
        return this.listMaterial;
    }

    public void setListMaterial(String listMaterial) {
        this.listMaterial = listMaterial;
    }

    @Column(name = "Images")
    public String getImages() {
        return this.images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Column(name = "VisitNum")
    public Integer getVisitNum() {
        return this.visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    @Column(name = "CategoryID")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

}
