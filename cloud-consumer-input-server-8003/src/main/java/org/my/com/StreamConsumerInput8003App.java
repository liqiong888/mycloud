package org.my.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StreamConsumerInput8003App {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerInput8003App.class, args);
    }
}
