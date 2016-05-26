/**
 * 
 */
package com.vtth.food.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
    
    
    @RequestMapping(value="/Admin", method=RequestMethod.GET)
    public ModelAndView login(Model model, HttpSession session){
        
        return new ModelAndView("login");
    }
}
