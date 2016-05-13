/**
 * 
 */
package com.vtth.foodapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author SONY
 *
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
       return "home";
    }
}
