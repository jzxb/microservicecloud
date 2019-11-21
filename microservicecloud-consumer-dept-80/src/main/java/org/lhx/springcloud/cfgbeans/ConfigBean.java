package org.lhx.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import lombok.Builder;
import org.lhx.myrule.RandomRule_LHX;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lhx
 * @PackageName: org.lhx.springcloud.cfgbeans
 * @ClassName: ConfigBean
 * @date 2019/11/14 11:07
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
//        return new RoundRobinRule();
//        return new RandomRule();
        return new RandomRule_LHX();
    }

}

