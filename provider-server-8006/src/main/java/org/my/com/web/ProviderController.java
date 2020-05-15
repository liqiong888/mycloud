package org.my.com.web;

import lombok.extern.slf4j.Slf4j;
import org.my.com.entities.Users;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
@RequestMapping("/server")
@Slf4j
public class ProviderController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    RestTemplate restTemplate;


    @GetMapping
    public String getServerPort() {
        //测试自定义api
        Users users =new Users();

        return "spring cloud provider server port:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
