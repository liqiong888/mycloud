# spring cloud stream
## pom
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-stream-rabbit</artifactId>
        </dependency>
## yml
### 消息接收者(input)
    server:
      port: 8002
    spring:
      application:
        name: stream-consumer-input
      cloud:
        stream:
          binders: #此处设置要绑定的rabbitmq的服务信息
            defaultRabbit: #表示定义的名称 用于rabbitmq的整合
              type: rabbit #消息组件你设置
              environment: #设置rabbitmq的相关环境配置
                spring:
                  rabbitmq:
                    host: 39.105.136.137
                    port: 5672
                    username: guest
                    password: guest
          bindings: #服务的整合处理
            input: #这个名字是通道的名称
              destination: studyExchange #表示要使用的Exchange名称定义
              content-type: application/json #设置消息类型，本次为json 文本设置为 text/plain
              binder: defaultRabbit #设置要绑定的消息服务的具体设置
              group: mycloud  #分组  同组中的服务相互竞争：1.解决重复消费的问题；2.消息持久化
                              #同组的服务 实现轮询分组，每次只有一个消费者
### 消息消费者(output)
    server:
      port: 8001
    spring:
      application:
        name: stream-provider-output-8001
      cloud:
        stream:
          binders: #此处设置要绑定的rabbitmq的服务信息
            defaultRabbit: #表示定义的名称 用于rabbitmq的整合
              type: rabbit #消息组件你设置
              environment: #设置rabbitmq的相关环境配置
                spring:
                  rabbitmq:
                    host: 39.105.136.137
                    port: 5672
                    username: guest
                    password: guest
          bindings: #服务的整合处理
            output: #这个名字是通道的名称
              destination: studyExchange #表示要使用的Exchange名称定义
              content-type: application/json #设置消息类型，本次为json 文本设置为 text/plain
              binder: defaultRabbit #设置要绑定的消息服务的具体设置
### 业务层
#### 消费者
    @EnableBinding(Source.class)//定义消息的推送通道
    public class ProviderServiceImpl implements ProviderService {
    
        @Resource
        private MessageChannel output;//消息发送管道
    
    
        public String send() {
    
            String serial = UUID.randomUUID().toString();
            output.send(MessageBuilder.withPayload(serial).build());
            System.out.println("*****serial*****"+serial);
            return null;
        }
    }

#### 接收者
    @Component
    @EnableBinding(Sink.class)
    @Slf4j
    public class ReceiveMessageListenerController {
    
        @Value("${server.port}")
        private String serverPort;
    
        @StreamListener(Sink.INPUT)//消息监听
        public void input(Message<String> message) {
    
             log.info("{}",message.getPayload()+"----"+serverPort);
        }
    
    
    }