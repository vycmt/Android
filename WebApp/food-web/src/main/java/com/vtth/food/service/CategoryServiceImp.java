/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtth.food.dao.CategoryDAO;
import com.vtth.food.entity.TblCategory;

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
