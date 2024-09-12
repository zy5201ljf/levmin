package com.levmin.springmvc.controller;

import com.levmin.springmvc.entity.User;
import com.levmin.springmvc.service.UserServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/user")
    public ModelAndView user(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        List<User> all =
                userService.findAll();
        modelAndView.addObject("userList", userService.findAll());
        modelAndView.addObject("dateTim", new Date());
        modelAndView.setViewName("user");
        return modelAndView;
    }
}
