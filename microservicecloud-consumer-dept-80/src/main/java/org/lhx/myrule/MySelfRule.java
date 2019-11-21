package org.lhx.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lhx
 * @PackageName: org.lhx.myrule
 * @ClassName: MySelfRule
 * @date 2019/11/19 14:51
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        //Ribbon默认是轮询，我自定义为随机
        return new RandomRule_LHX();
    }
}
