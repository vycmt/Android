package com.vtth.foodapi.dto;

import java.io.Serializable;

import com.vtth.foodapi.entity.TblFooddetail;

public class FoodDetailDTO implements Serializable {

    /** . */
    private static final long serialVersionUID = 6412908996362240110L;
    //    private static final long serialVersionUID = -7988799579036225137L;
    private int foodId;
    private String materialDetail;
    private String tutorial;
    private String source;

    public FoodDetailDTO() {
        // TODO Auto-generated constructor stub
        System.out.println("FoodDetailDTO()");
    }

    public FoodDetailDTO(int foodId, String materialDetail, String tutorial, String source) {
        this.foodId = foodId;
        this.materialDetail = materialDetail;
        this.tutorial = tutorial;
        this.source = source;
    }

    public FoodDetailDTO(TblFooddetail foodDetail) {
        this.foodId = foodDetail.getFoodId();
        this.materialDetail = foodDetail.getMaterialDetail();
        this.tutorial = foodDetail.getTutorial();
        this.source = foodDetail.getSource();
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getMaterialDetail() {
        return materialDetail;
    }

    public void setMaterialDetail(String materialDetail) {
        this.materialDetail = materialDetail;
    }

    public String getTutorial() {
        return tutorial;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
