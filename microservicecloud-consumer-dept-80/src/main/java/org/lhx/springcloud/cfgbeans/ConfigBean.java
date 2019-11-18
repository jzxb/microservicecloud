package org.lhx.springcloud.cfgbeans;

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
public class ConfigBean
{
    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}

