/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vtth.food.dao.CategoryDAO;
import com.vtth.food.entity.TblCategory;

/**
 * @author SONY
 *
 */
@Service // bắt buộc phải có
@Transactional // bắt buộc phải có
public class CategoryServiceImp implements CategoryService {

    @Autowired // bắt buộc phải có
    CategoryDAO categoryDAO;

    // bắt buộc phải có
    public CategoryServiceImp() {
        // TODO Auto-generated constructor stub
        System.out.println("CategoryServiceImp()");
    }

    // Demo mẫu
    public List<TblCategory> getCategory() {
        return categoryDAO.getCategory();
    }

    public Serializable createCategory(TblCategory newCategory) {
        return categoryDAO.createCategory(newCategory);
    }

}
