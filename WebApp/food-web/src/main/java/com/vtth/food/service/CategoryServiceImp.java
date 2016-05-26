/**
 * 
 */
package com.vtth.food.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vtth.food.entity.TblCategory;

/**
 * @author SONY
 *
 */
@Service
@Transactional
public class CategoryServiceImp implements CategoryService {

    public CategoryServiceImp() {
        // TODO Auto-generated constructor stub
        System.out.println("CategoryServiceImp()");
    }
    
    public List<TblCategory> getCategory() {
        // TODO Auto-generated method stub
        return null;
    }

    public Serializable createCategory(TblCategory newCategory) {
        // TODO Auto-generated method stub
        return null;
    }

}
