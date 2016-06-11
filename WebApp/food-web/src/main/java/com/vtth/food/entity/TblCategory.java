package com.vtth.food.entity;
// Generated May 20, 2016 3:45:49 PM by Hibernate Tools 5.1.0.Alpha1

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_category", catalog = "fooddb")
public class TblCategory implements java.io.Serializable {

    /** . */
    private static final long serialVersionUID = 476585990090558419L;
    private Integer categoryId;
    private String categoryName;

    public TblCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public TblCategory() {
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "CategoryID", unique = true, nullable = false)
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Column(name = "CategoryName", nullable = false, length = 500)
    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
