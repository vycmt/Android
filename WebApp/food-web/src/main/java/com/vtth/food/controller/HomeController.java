/**
 * 
 */
package com.vtth.food.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cathl.icook.entity.TblFood;
import com.cathl.icook.entity.TblUser;

/**
 * @author SONY
 *
 */
@Controller
public class HomeController {
        
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView homePage(){
        return new ModelAndView("index");
    }
    
   
    
    @RequestMapping(value = "/Admin", method = RequestMethod.POST)
	public String home(@ModelAttribute("user") TblUser user, Locale locale, Model model, HttpSession session) {
		TblUser checkUser = userService.checkLogin(user);
		if (checkUser != null) {
			session.setAttribute("username", checkUser.getUserName());
			model.addAttribute("pageheader", "Admin");//set header  at view
			model.addAttribute("activeTab", "Dashboard");//set active tab at view
			return "dashboard";
		}
		model.addAttribute("error", "wrong");
		return "login";
	}
    
    @RequestMapping(value = "/Admin", method = RequestMethod.GET)
   	public ModelAndView login(Model model, HttpSession session) {
   		if (session.getAttribute("username") != null) {

   			if ((Integer) session.getAttribute("role") == 0) {
   				model.addAttribute("pageheader", "Admin");//set header  at view
   				model.addAttribute("activeTab", "Dashboard");//set active tab at view
   				return "dashboard";
   			}
   		} else {
   			return new ModelAndView("login", "user", new TblUser());
   		}
   		return null;
   	}

	@RequestMapping(value = "/signOut", method = RequestMethod.GET)
	public String signOut(HttpSession session) {
		session.removeAttribute("username");
		session.removeAttribute("role");
		return "redirect:/";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView registerPage() {
		return new ModelAndView("register", "newUser", new TblUser());
	}
}