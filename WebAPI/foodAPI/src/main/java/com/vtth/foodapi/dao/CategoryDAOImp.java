package com.vtth.foodapi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vtth.foodapi.entity.TblCategory;
import com.vtth.foodapi.util.HibernateUtil;

@Repository
public class CategoryDAOImp implements CategoryDAO {

    @Autowired
    HibernateUtil utils;

    public CategoryDAOImp() {
        System.out.println("CategoryDAOImp()");
    }

    public TblCategory getCategory(int id) {
        return utils.fetchById(id, TblCategory.class);
    }

}
