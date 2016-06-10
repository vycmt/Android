/**
 * 
 */
package com.vtth.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vtth.food.dto.FoodDTO;
import com.vtth.food.entity.TblFood;
import com.vtth.food.entity.TblFooddetail;
import com.vtth.food.service.FoodDetailService;
import com.vtth.food.service.FoodService;
import com.vtth.food.service.SearchService;

@Controller
public class SearchController {

    @Autowired
    private SearchService searchService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private FoodDetailService foodDetailService;

    @RequestMapping(value = "search", method = RequestMethod.POST)
    @ResponseBody
    public List<FoodDTO> searchByMaterial(@RequestParam("materials") String materials, @RequestParam("start") int start,
            @RequestParam("limit") int limit) {
        System.out.println("Param: " + materials + "||" + start + "|| " + limit);
        return searchService.searchByMaterial(materials, start, limit);
    }

    @RequestMapping(value = "/food/{id}")
    public String searchById(@PathVariable("id") int foodID, Model model) {
        TblFooddetail foodDetail = foodDetailService.getFoodDetail(foodID);
        TblFood food = foodService.incrVisitNum(foodID);
        model.addAttribute("foodDetail", foodDetail);
        model.addAttribute("food", food);
        return "detail";
    }
}
