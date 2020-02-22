package com.friend.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@EnableConfigServer
@SpringBootApplication
public class Config3344_Application {

    public static void main(String[] args) {
        SpringApplication.run(Config3344_Application.class, args);
    }
}
