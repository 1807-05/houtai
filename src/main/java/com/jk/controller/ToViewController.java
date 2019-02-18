package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class ToViewController {

    @RequestMapping("toView")
    public String ToView(String viewName){

        return viewName;
    }
}
