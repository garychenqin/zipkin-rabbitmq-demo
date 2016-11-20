package com.baidu.bpit.frontend.service.impl;

import com.baidu.bpit.frontend.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chenshouqin on 2016-11-20 20:58.
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getRemoteMsg() {
        return restTemplate.getForObject("http://localhost:8081/hello", String.class);
    }
}
