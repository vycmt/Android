/**
 * 
 */
package com.vtth.foodapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.vtth.foodapi.entity.TblFood;
import com.vtth.foodapi.util.HibernateUtil;

/**
 * @author SONY
 *
 */
@Repository
public class FoodDAOImp implements FoodDAO {

    public FoodDAOImp() {
        System.out.println("FoodDAOImp()");
    }

    @Autowired
    private HibernateUtil utils;

    public TblFood getFood(int id) {
        return utils.fetchById(id, TblFood.class);
    }

    public List<TblFood> searchByMaterial(String material, int start, int limit) {
        String[] searchObj = material.split("-");
        
        if (searchObj.length > 0){
            String query = String.format(" WHERE listMaterial LIKE '%s'", ("%" + searchObj[0] + "%"));
            for (int i = 1; i < searchObj.length; i++) {
                String tmp = String.format(" AND listMaterial LIKE '%s'", ("%" + searchObj[i] + "%"));
                query += tmp;
            }
            query += " ORDER BY visitNum DESC";
            System.out.println(query);
            return utils.fetchAllByQuery(query, start, limit, TblFood.class);
        }

        return null;
    }

}
