/**
 * 
 */
package com.vtth.food.service;

import java.util.List;

import com.vtth.food.dto.FoodDTO;
import com.vtth.food.entity.TblFooddetail;

/**
 * @author SONY
 *
 */
public interface SearchService {

    public List<FoodDTO> searchByMaterial(String material, int start, int limit);
    public List<FoodDTO> searchByAPI(String material, int start, int limit);
}
