/**
 * 
 */
package com.vtth.food.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vtth.food.entity.TblFooddetail;

/**
 * @author SONY
 *
 */
@Service
@Transactional
public class SearchServiceImp implements SearchService {

    public SearchServiceImp() {
        System.out.println("SearchServiceImp()");
    }
    
    public List<TblFooddetail> searchByMaterial(String material, int start, int limit) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<TblFooddetail> searchByAPI(String material, int start, int limit) {
        // TODO Auto-generated method stub
        return null;
    }

}
