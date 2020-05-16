
## spring cloud config
### pom 
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-config-server</artifactId>
        </dependency>
### yml yaml properties
    spring:
      application:
        name: cloud-config-server-3344
      cloud:
        config:
          server:
            git:
              uri: https://github.com/liqiong888/cloudConfig.git #仓库地址
              search-paths:
                - cloudConfig 
              label: master #分支名称
### springbootApp
    @EnableConfigServer
    
    
    
    
## SpringCloud-Bus 
### pom
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-bus-amqp</artifactId>
    </dependency>
###application.yml
    spring:
      rabbitmq:
        host: 39.105.136.137
        port: 5672
        username: guest
        password: guest
    #rabbitmq相关配置，暴露bus刷新配置的端点
    management:
      endpoints:
        web:
          exposure:
            include: 'bus-refresh'
#### 全局刷新
curl -X POST "http://localhost:3344/actuator/bus-refresh"
#### 定点刷新
curl -X POST "http://localhost:3344/actuator/bus-refresh"/${spring.application.name:server.port}