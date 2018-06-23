package com.ufa.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HaozaiController {

    @GetMapping("/haozai")
    public String getHaozai(){
        return "haozai";
    }
}
