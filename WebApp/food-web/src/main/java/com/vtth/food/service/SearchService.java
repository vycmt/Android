/**
 * 
 */
package com.vtth.food.service;

import java.util.List;

import com.vtth.food.entity.TblFooddetail;

/**
 * @author SONY
 *
 */
public interface SearchService {

    public List<TblFooddetail> searchByMaterial(String material, int start, int limit);
    public List<TblFooddetail> searchByAPI(String material, int start, int limit);
}
