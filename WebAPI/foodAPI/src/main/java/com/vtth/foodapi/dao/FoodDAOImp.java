/**
 * 
 */
package com.vtth.foodapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vtth.foodapi.entity.TblFood;
import com.vtth.foodapi.util.HibernateUtil;

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

    public List<TblFood> searchByMaterial(String materials, int start, int limit) {
        String[] searchs = materials.split("-");
        if (searchs.length > 0) {
            String query = String.format(" WHERE listMaterial LIKE '%s'", ("%" + searchs[0] + "%"));
            for (int i = 1; i < searchs.length; i++) {
                String tmp = String.format(" AND listMaterial LIKE '%s'", ("%" + searchs[i] + "%"));
                query += tmp;
            }
            query += " ORDER BY visitNum DESC";
            System.out.println(query);
            return utils.fetchAllByQuery(query, start, limit, TblFood.class);
        }
        return null;
    }

    public TblFood increaseVisistNum(int id) {

        TblFood food = utils.fetchById(id, TblFood.class);
        food.setVisitNum(food.getVisitNum() + 1);
        return utils.update(food);
    }

}
