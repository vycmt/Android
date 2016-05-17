/**
 * 
 */
package com.vtth.foodapi.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SONY
 *
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
       return "Home";
    }
}
