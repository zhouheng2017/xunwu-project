package com.imooc.xunwuproject.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2018-07-27
 * @Time: 9:26
 */
@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String gethtml(Model model) {
        model.addAttribute("name", "周恒");
        model.addAttribute("age", "24");
        return "index";
    }

    @GetMapping("/404")
    public String notFoundPage() {
        return "404";
    }

    @GetMapping("/403")
    public String accessError() {
        return "403";
    }

    @GetMapping("/500")
    public String internalError() {
        return "500";
    }

    @GetMapping("/logout/page")
    public String logout() {
        return "logout";
    }
}
