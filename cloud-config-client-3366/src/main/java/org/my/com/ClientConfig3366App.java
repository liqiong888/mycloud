package org.my.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientConfig3366App {
    public static void main(String[] args) {
        SpringApplication.run(ClientConfig3366App.class, args);
    }
}
