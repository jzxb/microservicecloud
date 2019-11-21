package org.lhx.springcloud;

import org.lhx.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author lhx
 * @PackageName: org.lhx.springcloud
 * @ClassName: DeptConsumer80_App
 * @date 2019/11/14 11:21
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration= MySelfRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args)
    {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}