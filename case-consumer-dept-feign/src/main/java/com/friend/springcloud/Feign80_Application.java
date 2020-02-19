package com.friend.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class Feign80_Application {
    public static void main(String[] args) {
        SpringApplication.run(Feign80_Application.class, args);
    }
}
