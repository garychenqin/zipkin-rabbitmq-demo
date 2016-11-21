# zipkin-rabbitmq-demo

> 该项目只能支持JDK1.8+ ！！

SpringBoot利用ZipKin结合RabbitMQ实现服务请求 Trace及性能度量

```
zipkin-server:性能数据的收集及展示，http://localhost:9411
frontend-demo:接收用户发送的请求并分发到backend-demo进行处理， http://localhost:8080/hello
backend-demo:接收front-demo发过来的请求处理后返回
```

修改RabbitMQ连接信息后启动三个服务，请求front-demo接口：http://localhost:8080/hello，然后打开http://localhost:9411便可以对Trace及性能进行跟踪查看
