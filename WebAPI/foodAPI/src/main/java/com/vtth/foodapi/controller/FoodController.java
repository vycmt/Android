/**
 * 
 */
package com.vtth.foodapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;

import com.vtth.foodapi.dto.FoodDTO;
import com.vtth.foodapi.dto.FoodDetailDTO;
import com.vtth.foodapi.entity.TblFood;
import com.vtth.foodapi.entity.TblFooddetail;
import com.vtth.foodapi.service.FoodDetailService;
import com.vtth.foodapi.service.FoodService;
import com.vtth.foodapi.util.SearchObj;


/**
 * @author SONY
 *
 */
@RestController
public class FoodController {

    public FoodController() {
        System.out.println("Food Controller");
    }

    @Autowired
    private FoodService service;
    @Autowired
    private FoodDetailService detailService;

//    @RequestMapping("/food/{id}")
//    public TblFood getFood(@PathVariable("id") int foodId) {
//        TblFood food = service.getFood(foodId);
//        // FoodDTO foodDTO = new FoodDTO(food);
//        return food;
//    }
     

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public List<FoodDTO> searchByMaterial(@RequestBody SearchObj searchObj) {

        List<TblFood> food = service.searchByMaterial(searchObj.getMaterials(), searchObj.getStart(),
                searchObj.getLimit());

        List<FoodDTO> listFood = new ArrayList<FoodDTO>();
        for (TblFood newFood : food) {
            listFood.add(new FoodDTO(newFood));
        }
        return listFood;
    }

    @RequestMapping("search/{id}")
    public FoodDetailDTO getFoodDetail(@PathVariable("id") int id) {

        TblFooddetail foodDetail = detailService.getFood(id);

        FoodDetailDTO foodDetailDTO = new FoodDetailDTO(foodDetail);

        return foodDetailDTO;

    }
}
