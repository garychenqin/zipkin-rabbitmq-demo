package com.baidu.bpit.zipkin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * Created by chenshouqin on 2016-11-20 18:55.
 */
@SpringBootApplication
@EnableZipkinStreamServer
public class ZipKinServerStarter {

    private static Logger logger = LoggerFactory.getLogger(ZipKinServerStarter.class);

    public static void main(String[] args) {
        logger.info("ZipKin server begin start ...");
        SpringApplication.run(ZipKinServerStarter.class, args);
    }
}
