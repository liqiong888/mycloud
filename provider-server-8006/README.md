# Eureka Client
## pom
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
## sprinBbootApp
    @SpringBootApplication
    @EnableEurekaClient
### application.yml
    server:
      port: 8006
    spring:
      application:
        name: provider-server-eureka
    
    eureka:
      client:
        service-url:
          defaultZone: http://localhost:7001/eureka,http://localhost:7002/eureka,
      #将自己注册进eureka
      register-with-eureka: true
      #  抓取注册中心
      fetch-registry: true