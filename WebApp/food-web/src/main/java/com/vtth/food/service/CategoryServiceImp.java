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
 * @author KMF
 *
 */
@Service
@Transactional
public class CategoryServiceImp implements CategoryService {

    @Autowired
    CategoryDAO categoryDAO;

    public CategoryServiceImp() {
        System.out.println("CategoryServiceImp()");
    }

    public List<TblCategory> getCategory() {
        return categoryDAO.getCategory();
    }

    public Serializable createCategory(TblCategory newCategory) {
        return categoryDAO.createCategory(newCategory);
    }

}
