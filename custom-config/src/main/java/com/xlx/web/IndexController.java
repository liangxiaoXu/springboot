package com.xlx.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xuliangxiao on 2017/7/20 16:46
 */
@RestController
@RequestMapping("index/")
public class IndexController {

    @Value("${name}")
    String name;

    @RequestMapping("home")
    String homePage(HttpServletRequest request, HttpServletResponse response){
        return "Hello," + name;
    }

}
