# SpringBoot GRPC DEMO

## 目的

该项目主要用来在SpringBoot中集成使用GRpc，来完成服务间的远程调用

## 结构

```text
|grpc-demo
|--grpc-proto: 声明服务间调用的方法和模型
|--grpc-client: 客户端，用来调用服务端代码
|--grpc-server: 服务端，用来提供具体的方法实现
```

## 运行

打包略

分别启动客户端与服务端，访问 http://localhost:8000