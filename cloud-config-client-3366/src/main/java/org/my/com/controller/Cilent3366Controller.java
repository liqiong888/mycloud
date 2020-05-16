package org.my.com.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
@RefreshScope
public class Cilent3366Controller {

    @Value("${config.info}")
    private String configInfo;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getConfigInfo3366")
    public String getConfigInfo() {
        return configInfo + "---" + UUID.randomUUID();
    }

    @GetMapping("/getConfigInfoBus3366")
    public String getConfigInfoBus() {
        return configInfo + "---" + UUID.randomUUID()+"----"+serverPort;
    }
}
