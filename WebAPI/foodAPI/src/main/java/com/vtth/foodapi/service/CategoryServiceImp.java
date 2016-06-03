package com.vtth.foodapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vtth.foodapi.dao.CategoryDAO;
import com.vtth.foodapi.entity.TblCategory;

@Service
@Transactional
public class CategoryServiceImp implements CategoryService {
    
    public CategoryServiceImp() {
        System.out.println("CategoryServiceImp()");
    }

    @Autowired
    CategoryDAO categoryDAO;
    
    public TblCategory getCategory(int id) {
        return categoryDAO.getCategory(id);
    }

}
