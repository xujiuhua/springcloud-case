package com.frient.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@EnableEurekaServer
@SpringBootApplication
public class ConfigEurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaServer.class, args);
    }
}
