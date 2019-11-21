package org.lhx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author lhx
 * @PackageName: org.lhx.springcloud
 * @ClassName: DeptConsumer_DashBoard_App
 * @date 2019/11/21 14:42
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
    }

}
