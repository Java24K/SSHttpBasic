package com.mine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = { "/", "/guest" }, method = RequestMethod.GET)
    public ModelAndView welcome() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "guest");
        model.addObject("message", "This is welcome page!");
        model.setViewName("guest");
        return model;

    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView admin() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "admin");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");

        return model;

    }

}