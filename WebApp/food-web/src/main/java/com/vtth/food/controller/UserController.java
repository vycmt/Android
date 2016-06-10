package com.vtth.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vtth.food.entity.TblUser;
import com.vtth.food.service.UserService;

@Controller // @UserController
public class UserController {

    @Autowired
    private UserService userService;
//trang này mình có làm ko vậy :????
//tui nhớ register đâu có trong bài mình đâu
}
