package com.endava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by inastase on 11/15/2016.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/home")
    public String home(){
        return "HelloWorld";
    }

}
