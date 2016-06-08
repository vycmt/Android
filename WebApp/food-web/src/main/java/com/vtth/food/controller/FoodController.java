/**
 * 
 */
package com.vtth.food.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vtth.food.entity.TblFooddetail;
import com.vtth.food.entity.TblFood;
import com.vtth.food.service.FoodDetailService;
import com.vtth.food.service.FoodService;

/**
 * @author SONY
 *
 */
@Controller
public class FoodController {
	@Autowired
	private FoodService foodService;
	@Autowired
	private FoodDetailService foodDetailService;
	private Integer foodID;
	
	@RequestMapping(value = "/getFood", method = RequestMethod.GET)
	@ResponseBody
	public List<TblFood> getFood(HttpSession session) {
		if (session.getAttribute("username") != null) {
			List<TblFood> result = new ArrayList<TblFood>();
			result = foodService.getFood();
			return result;
		}
		return null;
	}
	
	@RequestMapping(value = "/getFoodID", method = RequestMethod.GET)
	@ResponseBody
	public TblFood getFoodID(@RequestParam("txtFoodID") String foodID, HttpSession session) {
		if (session.getAttribute("username") != null) {
			Integer foodIDInt = null;
			System.out.println(foodID);
			try {
				foodIDInt = Integer.parseInt(foodID);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			TblFood result = foodService.getFoodID(foodIDInt);
			return result;
		}
		return null;
	}
	
	@RequestMapping(value = "/createFoodDetail", method = RequestMethod.POST)
	@ResponseBody
	public TblFoodDetail createFoodDetail(@RequestBody TblFooddetail newFoodDetail, HttpSession session) {
		Serializable result;
		TblFooddetail foodDetail = new TblFooddetail(foodID, newFoodDetail.getMaterialDetail(),
				newFoodDetail.getTutorial(), newFoodDetail.getSource());
		foodDetail.setFoodId(foodID);
		result = foodDetailService.createFoodDetail(foodDetail);
		System.out.println(result);
		return foodDetail;
	}

	@RequestMapping(value = "/createFood", method = RequestMethod.POST)
	@ResponseBody
	public TblFood createFood(@RequestBody TblFood newFood, HttpSession session) {
		Serializable result;
		TblFood food = new TblFood(newFood.getCategoryID(), newFood.getFoodName(), newFood.getDescription(),
				newFood.getListMaterial());
		result = foodService.createFood(food);
		foodID = food.getFoodId();
		System.out.println(foodID);
		return food;
	}
}