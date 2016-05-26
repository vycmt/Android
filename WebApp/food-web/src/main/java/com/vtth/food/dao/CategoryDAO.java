/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import com.vtth.food.entity.TblCategory;

/**
 * @author SONY
 *
 */
public interface CategoryDAO {

    public List<TblCategory> getCategory();
    public Serializable createCategory(TblCategory newCategory);
    
}
