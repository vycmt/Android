package se0965.vtth.com.android.model;

import java.io.Serializable;

/**
 * Created by SONY on 5/28/2016.
 */
public class FoodDetail implements Serializable {

    private int foodId;
    private String materialDetail;
    private String tutorial;
    private String source;

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
}
