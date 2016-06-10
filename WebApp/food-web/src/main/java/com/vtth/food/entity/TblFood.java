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
    private String foodName;
    private Integer categoryID;
    private String description;
    private String listMaterial;
    private String images;
    private Integer visitNum;
    private String userID;

    public TblFood() {
    }

    public TblFood(String foodName, Integer categoryID, String description, String listMaterial, String images,Integer visitNum) {
        super();
        this.foodName = foodName;
        this.categoryID = categoryID;
        this.description = description;
        this.listMaterial = listMaterial;
        this.images = images;
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
    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    @Column(name = "UserID")
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

}
