package com.kitiyou.snacks.controller;

import com.kitiyou.snacks.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return helloService.hello().toString();
    }

}
