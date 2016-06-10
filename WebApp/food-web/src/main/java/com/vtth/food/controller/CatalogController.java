/**
 * 
 */
package com.vtth.food.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vtth.food.entity.TblCategory;
import com.vtth.food.service.CategoryService;

/**
 * @author SONY
 *
 */
@Controller
public class CatalogController {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/getCategory", method = RequestMethod.GET)
	@ResponseBody
	public List<TblCategory> getCategory(Model m, HttpSession session) {
		if (session.getAttribute("username") != null) {
			List<TblCategory> result = new ArrayList<TblCategory>();
			result = categoryService.getCategory();
			for (TblCategory tblCategory : result) {
				System.out.println(tblCategory.getCategoryName());
			}
			return result;
		}
		return null;
	}

	@RequestMapping(value = "/createCaltalogue", method = RequestMethod.POST)
	public @ResponseBody TblCategory updateFood(@RequestBody TblCategory catalog, HttpSession session) {
		int count = 0;
		List<TblCategory> allCatalog = categoryService.getCategory();
		for (TblCategory tblCategory : allCatalog) {
			if (tblCategory.getCategoryName().toUpperCase().equals(catalog.getCategoryName().toUpperCase())) {
				count++;
			}
		}
		if (count == 0) {
			TblCategory newCalte = new TblCategory(catalog.getCategoryName());
			return newCalte;
		}
		return null;
	}
}