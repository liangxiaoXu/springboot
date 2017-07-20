package com.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xuliangxiao on 2017/7/20 14:22
 */
@RestController
@RequestMapping("/index/")
public class IndexController {

    @RequestMapping("home")
    String homePage(HttpServletRequest request, HttpServletResponse response){
        return "Hello, i'am home page.";
    }

}
