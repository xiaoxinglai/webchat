package com.niubi.webchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName indexController
 * @Author laixiaoxing
 * @Date 2020/6/11 下午10:52
 * @Description TODO
 * @Version 1.0
 */
@Controller
public class indexController {

    @RequestMapping("/index")
    public String index(){

        return "index";
    }
}
