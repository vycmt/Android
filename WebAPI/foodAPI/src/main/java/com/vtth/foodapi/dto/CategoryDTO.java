package com.vtth.foodapi.dto;

import java.io.Serializable;

import com.vtth.foodapi.entity.TblCategory;

public class CategoryDTO implements Serializable {

    /** . */
    private static final long serialVersionUID = -7417453812325643504L;

    private int categoryId;
    private String categoryName;

    public CategoryDTO() {
        // TODO Auto-generated constructor stub
    }

    public CategoryDTO(int categoryId, String categoryName) {
        super();
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public CategoryDTO(TblCategory category) {
        this.categoryId = category.getCategoryId();
        this.categoryName = category.getCategoryName();
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
