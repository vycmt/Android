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
public interface CategoryService {

    public List<TblCategory> getCategory();
    public Serializable createCategory(TblCategory newCategory);
}
