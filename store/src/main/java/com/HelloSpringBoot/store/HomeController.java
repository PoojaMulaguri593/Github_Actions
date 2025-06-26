package com.HelloSpringBoot.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;
    @RequestMapping("/")
    public String index(){
        System.out.println(appName);
        String viewName=getViewName();
        System.out.println(viewName);
        return viewName;
    }
    private String getViewName(){
        return "index.html";
    }
}
