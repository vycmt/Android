package se0965.vtth.com.android.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.j256.ormlite.field.DatabaseField;

import java.io.Serializable;

/**
 * Created by SONY on 5/28/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Food implements Serializable {

    @DatabaseField
    private int foodId;

    @DatabaseField
    private String foodName;

    @DatabaseField
    private String description;

    @DatabaseField
    private String images;

    @DatabaseField
    private String materialDetail;

    @DatabaseField
    private String tutorial;

    @DatabaseField
    private String source;

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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
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
