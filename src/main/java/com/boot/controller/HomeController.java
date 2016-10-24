package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amzas on 24/10/2016.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "HeyyIooo! ";
    }

}
