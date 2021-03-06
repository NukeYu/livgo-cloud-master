package com.livgo.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description:Eureka服务注册中心
 * Author:     gaocl
 * Date:       2017/12/1
 * Version:    V1.0.0
 * Update:     更新说明
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationEurekaServer.class, args);
    }
}
