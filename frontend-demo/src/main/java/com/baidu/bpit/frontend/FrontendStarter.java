package com.baidu.bpit.frontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by chenshouqin on 2016-11-20 19:46.
 */
@SpringBootApplication
public class FrontendStarter {

    public static void main(String[] args) {
        SpringApplication.run(FrontendStarter.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
