package com.baidu.bpit.frontend.controller;

import com.baidu.bpit.frontend.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenshouqin on 2016-11-20 20:56.
 */
@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping("/hello")
    public String helloWorld() {
        return helloWorldService.getRemoteMsg();
    }
}
