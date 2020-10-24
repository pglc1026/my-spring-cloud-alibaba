# Spring Cloud Alibaba

#### 介绍
Spring Cloud Alibaba 学习，学习各个组件的使用  
[版本选择说明](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)

#### 项目介绍

```
spring-cloud-alibaba-parent
│ |- 父项目
├─nacos-discovery [博客](https://blog.csdn.net/fu_huo_1993/article/details/109257707)
│ |- 注册中心
│ │- user-consumer-9091
| |		 >> 1、只作为服务消费者,不注册 nacos 上
│ │					** spring.cloud.nacos.discovery.register-enabled = false
│ │    >> 2、配置 nacos 服务地址
│ │         ** spring.cloud.nacos.discovery.server-addr=地址，不需要[http|https]
│ │    >> 3、自定义注册到 nacos 上的服务名，默认是获取的spring.application.name的值
│ │         ** spring.cloud.nacos.discovery.service=服务名
│ │    >> 4、集成ribbon
│ │    			** ribbon.nacos.enabled=true  true=集成,false=不集成
│ │- user-provider-9092
│ │- user-provider-9093
│ │    >> 1、服务提供者，注册到 nacos 上。
│ │					** spring.cloud.nacos.discovery.register-enabled = true
│ │    >> 2、设置元数据。
│ │					** spring.cloud.nacos.discovery.metadata  (key value) 格式
│ │    >> 3、命名空间的配置。
│ │					** spring.cloud.nacos.discovery.namespace 用于区分不同的环境，比如 dev、local等，需要写 命名空间ID 的值
│ │    >> 4、配置组，不同的服务可以划分到一个组，默认是 DEFAULT_GROUP。
│ │					** spring.cloud.nacos.discovery.group
│ │    >> 5、配置集群，默认值是 DEFAULT
│ │					** spring.cloud.nacos.discovery.cluster-name


```







#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request

1、[Spring Cloud、Spring Cloud Alibaba、Spring Boot 版本说明](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)  