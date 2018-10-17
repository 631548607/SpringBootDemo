package com.demo.hc.controller;

import com.demo.hc.model.ImageInfoModel;
import com.demo.hc.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private ImageService imageService;

    @RequestMapping("")
    public String index(ModelMap modelMap, HttpServletRequest request){
        ImageInfoModel imageInfoModel =imageService.getImagById("8216e072-cd61-11e8-aced-0a0027000003");
        modelMap.put("name","helloworld");
        return "/index";
    }
    @RequestMapping("index")
    public String index1(){
        return "index";
    }
}
