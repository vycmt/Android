/**
 * 
 */
package com.vtth.food.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.vtth.food.entity.TblUser;
import com.vtth.food.service.FoodService;
import com.vtth.food.service.UserService;

@Controller
public class HomeController {

    // Thiếu khai báo Service
    @Autowired
    UserService userService;
    @Autowired
    FoodService foodService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView homePage() {
        return new ModelAndView("index");
    }
    
    @RequestMapping(value = "/Admin", method = RequestMethod.GET)
    public ModelAndView login(Model model, HttpSession session) {
        if (session.getAttribute("username") != null) {
            model.addAttribute("pageheader", "Admin");// set header at view
            model.addAttribute("activeTab", "Dashboard");// set active tab at view
            return new ModelAndView("dashboard");
        } else {
            return new ModelAndView("login", "user", new TblUser());
        }
    }

    @RequestMapping(value = "/Admin", method = RequestMethod.POST)
    public String home(@ModelAttribute("user") TblUser user, Locale locale, Model model, HttpSession session) {
        TblUser checkUser = userService.checkLogin(user);
        if (checkUser != null) {
            session.setAttribute("username", checkUser.getUserName());
            model.addAttribute("pageheader", "Admin");// set header at view
            model.addAttribute("activeTab", "Dashboard");// set active tab at view
            return "dashboard";
        }
        model.addAttribute("error", "wrong");
        return "login";
    }

    

    @RequestMapping(value = "/signOut", method = RequestMethod.GET)
    public String signOut(HttpSession session) {
        session.removeAttribute("username");
        session.removeAttribute("role");
        return "redirect:/";
    }

}