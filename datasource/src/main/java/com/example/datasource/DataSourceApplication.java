package com.example.datasource;

import org.springframework.boot.SpringApplication;

//@MapperScan("com.example.datasource.generator.*")
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
// 表示通过aop框架暴露该代理对象,AopContext能够访问
//@EnableAspectJAutoProxy(exposeProxy = true)
public class DataSourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataSourceApplication.class, args);
    }

}
