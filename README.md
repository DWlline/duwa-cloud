<p align="center">
 <img src="https://img.shields.io/circleci/project/vuejs/vue/dev.svg" alt="Build Status">
  <img src="https://img.shields.io/badge/Spring%20Cloud-Hoxton.SR9-blue.svg" alt="Coverage Status">
  <img src="https://img.shields.io/badge/Spring%20Boot-2.3.7.RELEASE-blue.svg" alt="Downloads">
</p>
<h2 align="center">DuWa-cloud</h2>

DuWa-cloud 基于 Spring Boot, Spring Cloud 构建微服务架构企业级开发平台，网关集成Swagger聚合所有服务API文档。

## 服务介绍
项目名称	| 编号 | 名称	| 说明	
------------- | ------------- | ------------------------- | -------------
duwa-cloud-config | config-server | 配置中心 | 基于Spring Cloud构建统一配置服务，负责管理所有服务的配置文件
duwa-cloud-gateway | gateway | 网关服务 | 基于gateway构建服务网关，并对服务进行负载，前只实现静态路由
duwa-cloud-provider | provider | 服务提供者 | 提供服务
duwa-cloud-consumer | consumer | 服务调用者 | 服务调用
duwa-cloud-auth | auth | 认证服务 | 基于SpringSecurity进行安全认证，采用OAuth2.0认证体系，对客户端、用户进行认证及授权，支持账号密码登录，短信验证码登录
duwa-cloud-monitor | monitor | 服务监控 | 基于Spring Boot Admin集成Turbine,Hystrix，对应用状态进行监控，对服务调用进行追踪和对熔断进行监测

##快速启动

### 下载代码
```
 git clone https://github.com/DWlline/duwa-cloud.git
```

### 启动服务
启动顺序如下：
```
 config
 auth-service
 provider 
 consumer 
 gateway
 monitor
```
### 访问
```
http://localhost:32000/ 服务网关，已经聚合了所有服务的Swagger
http://consul-ip:8500/ 注册中心，可以查看服务注册情况
```
