package com.vtth.foodapi.entity;
// Generated Jun 3, 2016 12:27:17 PM by Hibernate Tools 5.0.0.Alpha3

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * TblFooddetail generated by hbm2java
 */
@Entity
@Table(name = "tbl_fooddetail", catalog = "fooddb")
public class TblFooddetail implements java.io.Serializable {

    /** . */
    private static final long serialVersionUID = -619412732890726962L;

    private Integer foodId;
    private String materialDetail;
    private String tutorial;
    private String source;

    public TblFooddetail() {
    }

    @GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "tblFood"))
    @Id
   @GeneratedValue(generator = "generator")

    @Column(name = "FoodID", unique = true, nullable = false)
    public Integer getFoodId() {
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
