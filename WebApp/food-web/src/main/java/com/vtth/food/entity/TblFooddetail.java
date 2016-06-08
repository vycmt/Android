package com.vtth.food.entity;
// Generated May 20, 2016 3:45:49 PM by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "tbl_fooddetail", catalog = "fooddb")
public class TblFooddetail implements java.io.Serializable {

    /** . */
    private static final long serialVersionUID = -3226959737689483321L;
    private int foodId;
    private String materialDetail;
    private String tutorial;
    private String source;

    public TblFooddetail() {
    }

    public TblFooddetail(int foodId, String materialDetail, String tutorial, String source) {
        super();
        this.foodId = foodId;
        this.materialDetail = materialDetail;
        this.tutorial = tutorial;
        this.source = source;
    }

    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "tblFood"))
    @Id
    @GeneratedValue(generator = "generator")

    @Column(name = "FoodID", unique = true, nullable = false)
    public int getFoodId() {
        return this.foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    @Column(name = "MaterialDetail", length = 6000)
    public String getMaterialDetail() {
        return this.materialDetail;
    }

    public void setMaterialDetail(String materialDetail) {
        this.materialDetail = materialDetail;
    }

    @Column(name = "Tutorial", length = 15000)
    public String getTutorial() {
        return this.tutorial;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }

    @Column(name = "Source")
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
