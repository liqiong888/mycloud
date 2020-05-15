package org.my.com.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
@RestController
@RequestMapping("/web")
@Slf4j
public class ConsumercCntroller {


    @Resource
    RestTemplate restTemplate;

    @GetMapping
    public String getProvider() {
        String s = restTemplate.getForObject("http://provider-server-eureka/web", String.class);
        return s;

    }

}
