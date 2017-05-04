package com.wangnz.spring.servlet3.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
//@RequestMapping
@RequestMapping(value = {"/","/homePage"})
public class HomeController {
    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
