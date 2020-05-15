package org.my.com.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    /**
     *遇到的一个问题：
     * 如果不用该注解  ：restTemplate.getForObject("http://localhost:8006/web", String.class);
     * 如果启用这个注解：restTemplate.getForObject("http://${server-name}/web", String.class);
     */
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
