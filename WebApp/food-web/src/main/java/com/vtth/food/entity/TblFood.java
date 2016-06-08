package com.vtth.food.entity;
// Generated May 20, 2016 3:45:49 PM by Hibernate Tools 5.1.0.Alpha1

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_food", catalog = "fooddb")
public class TblFood implements java.io.Serializable {

    /** . */
    private static final long serialVersionUID = 432529343386898525L;
    private Integer foodId;
    private int categoryId;
    private String foodName;
    private String description;
    private String listMaterial;
    private String images;
    private Integer visitNum;

    public TblFood(int categoryId, String foodName, String description, String listMaterial) {
    }

    public TblFood(int categoryId, String foodName, String description, String images, String listMaterial,
            Integer visitNum) {
        this.categoryId = categoryId;
        this.foodName = foodName;
        this.description = description;
        this.images = images;
        this.listMaterial = listMaterial;

    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "FoodID", unique = true, nullable = false)
    public Integer getFoodId() {
        return this.foodId;
    }

    public void setFoodId(Integer foodId) {
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
