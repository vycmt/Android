package com.vtth.foodapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vtth.foodapi.dto.FoodDTO;
import com.vtth.foodapi.dto.FoodDetailDTO;
import com.vtth.foodapi.entity.TblFood;
import com.vtth.foodapi.entity.TblFooddetail;
import com.vtth.foodapi.service.CategoryService;
import com.vtth.foodapi.service.FoodDetailService;
import com.vtth.foodapi.service.FoodService;
import com.vtth.foodapi.util.SearchObj;

@RestController // same as @Controller but also have @ResponseBody is active
public class FoodController {

    public FoodController() {
        System.out.println("Food Controller");
    }

    @Autowired
    private FoodService foodService;
    @Autowired
    private FoodDetailService detailService;
//    @Autowired
//    private CategoryService categoryService;

//     @RequestMapping("/food/{id}")
//     public TblFood getFood(@PathVariable("id") int foodId) {
//     TblFood food = service.getFood(foodId);
//     // FoodDTO foodDTO = new FoodDTO(food);
//     return food;
//     }

    @RequestMapping(value = "search", method = RequestMethod.POST)
    public List<FoodDTO> searchByMaterial(@RequestBody SearchObj searchObj) {
        List<TblFood> listFood = foodService.searchByMaterial(searchObj.getMaterials(), searchObj.getStart(),
                searchObj.getLimit());
        List<FoodDTO> listFoodDTO = new ArrayList<FoodDTO>();
        for (TblFood food : listFood) {
            listFoodDTO.add(new FoodDTO(food));
        }
        return listFoodDTO;
    }

    @RequestMapping("/search/{id}")
    public FoodDetailDTO getFoodDetail(@PathVariable("id") int id) {
        TblFooddetail foodDetail = detailService.getFood(id);
        FoodDetailDTO foodDetailDTO = new FoodDetailDTO(foodDetail);
        return foodDetailDTO;
    }

//    @RequestMapping(value ="/category/{id}")
//    public CategoryDTO getCategory(@PathVariable("id") int id) {
//
//        TblCategory category = categoryService.getCategory(id);
//
//        CategoryDTO DTO = new CategoryDTO(category);
//
//        return DTO;
//    }

}
