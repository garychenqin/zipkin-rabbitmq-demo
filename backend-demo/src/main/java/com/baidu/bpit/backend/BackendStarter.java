package com.baidu.bpit.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chenshouqin on 2016-11-20 19:32.
 */
@SpringBootApplication
public class BackendStarter {

    public static void main(String[] args) {
        SpringApplication.run(BackendStarter.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
