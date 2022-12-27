package com.atech.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author raed abu Sa'da
 * on 27/12/2022
 */
@RequestMapping("/")
@Controller
public class HomeController {

    @GetMapping
    public String homePage(){
        return "home-page";
    }

}
