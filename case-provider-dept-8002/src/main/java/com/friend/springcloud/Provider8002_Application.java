package com.friend.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@MapperScan(basePackages = "com.friend.springcloud.dao")
@SpringBootApplication
@EnableEurekaClient
public class Provider8002_Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider8002_Application.class, args);
    }
}
