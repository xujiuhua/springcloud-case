package com.friend.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * <p></p>
 *
 * @author jiuhua.xu
 * @version 1.0
 * @since JDK 1.8
 */
@EnableHystrixDashboard
@SpringBootApplication
public class DeptConsumerDashBoard {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerDashBoard.class, args);
    }
}
