package org.lhx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lhx
 * @PackageName: org.lhx.springcloud
 * @ClassName: DeptConsumer80_Feign_App
 * @date 2019/11/14 11:21
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"org.lhx.springcloud"})
@ComponentScan("org.lhx.springcloud")
public class DeptConsumer80_Feign_App {
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}