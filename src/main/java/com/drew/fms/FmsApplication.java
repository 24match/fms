package com.drew.fms;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.drew.fms.mapper")
@SpringBootApplication
public class FmsApplication {

    private static final Logger logger = LoggerFactory.getLogger(FmsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FmsApplication.class, args);
        logger.info("========================启动完毕========================");
    }

}
