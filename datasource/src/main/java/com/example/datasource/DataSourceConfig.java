package com.example.datasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("com.example.datasource.generator.mapper")
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
// 表示通过aop框架暴露该代理对象,AopContext能够访问
//@EnableAspectJAutoProxy(exposeProxy = true)
@Configuration
public class DataSourceConfig {


}
