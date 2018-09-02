package com.imooc.xunwuproject.web.controller;

import com.imooc.xunwuproject.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2018-07-26
 * @Time: 8:38
 */
@Controller
@RequestMapping
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello, SpringBoot";
    }

    @RequestMapping("/hello.json")
    @ResponseBody
    public ApiResponse api() {
        return ApiResponse.ofMessage(200, "返回成功");
    }
}
