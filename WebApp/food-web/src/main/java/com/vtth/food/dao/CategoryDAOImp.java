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
 * @author SONY
 *
 */
@Repository // bắt buộc phải có
public class CategoryDAOImp implements CategoryDAO {

    /**
     * Constructor bắt buộc phải có 
     */
    public CategoryDAOImp() {
        // TODO Auto-generated constructor stub FOR DEBUGGING
        System.out.println("CategoryDAOImp()");
    }
    
    @Autowired // bat buoc phai co
    private HibernateUtil utils;
    
    public List<TblCategory> getCategory() {
        // TODO Auto-generated method stub
        return null;
    }

    // Demo mau
    public Serializable createCategory(TblCategory newCategory) {
        // TODO Auto-generated method stub
        return utils.create(newCategory);
    }

}
