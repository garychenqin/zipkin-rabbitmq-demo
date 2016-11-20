# zipkin-rabbitmq-demo

ZipKin只能支持JDK1.8+ ！！

SpringBoot利用ZipKin结合RabbitDemo实现的接口性能度量

zipkin-server:数据收集及展现，http://localhost:9411。
frontend-demo:前端处理请求 http://localhost:8080/hello。
backend-demo:后端数据处理并返回给前端

配置好自己的RabbitMq信息后启动三个服务，请求：http://localhost:8080/hello，然后打开http://localhost:9411便可以查看请求链
