/**
 * 
 */
package com.vtth.food.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vtth.food.entity.TblCategory;
import com.vtth.food.util.HibernateUtil;

/**
 * @author KMF
 *
 */
@Repository // data-centered: bị động ; các software agent connect tới data-centered
public class CategoryDAOImp implements CategoryDAO {

    /**
     * Constructor
     */
    public CategoryDAOImp() {
        System.out.println("CategoryDAOImp()");
    }
    
    @Autowired
    private HibernateUtil utils;
    
    public List<TblCategory> getCategory() {
        return utils.fetchAll(TblCategory.class);
    }

    public Serializable createCategory(TblCategory newCategory) {
        return utils.create(newCategory);
    }

}
