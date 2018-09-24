package com.demo.hc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by HC on 2018/9/24.
 */
@Controller
@RequestMapping("/")
public class pageContoller {

    @RequestMapping("")
    public String index(ModelMap modelMap, HttpServletRequest request){
        modelMap.put("name","helloworld");
        return "/index";
    }
    @RequestMapping("index")
    public String index1(){
        System.out.println("12231212");
        return "index";
    }
}
