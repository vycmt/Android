/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

public class FoodDetailDTO {

    private int foodID;
    private String materialDetail;
    private String tutorial;
    private String source;

    public FoodDetailDTO() {
    }

    public FoodDetailDTO(int foodID, String materialDetail, String tutorial, String source) {
        this.foodID = foodID;
        this.materialDetail = materialDetail;
        this.tutorial = tutorial;
        this.source = source;

    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
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
