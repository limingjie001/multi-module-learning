package com.example.datasource.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.example.datasource.DruidProperties;
import com.example.datasource.datasource.DynamicDataSource;
import com.example.datasource.utils.SpringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * druid 配置多数据源
 */
@Configuration
public class DruidConfig {
    //    @Bean
//    @ConfigurationProperties("spring.datasource.druid.master")
    public DataSource masterDataSource(DruidProperties druidProperties) {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        return druidProperties.dataSource(dataSource);
    }

    //    @Bean
//    @ConfigurationProperties("spring.datasource.druid.slave")
//    @ConditionalOnProperty(prefix = "spring.datasource.druid.slave", name = "enabled", havingValue = "true")
    public DataSource slaveDataSource(DruidProperties druidProperties) {
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        return druidProperties.dataSource(dataSource);
    }

    @Bean(name = "dynamicDataSource")
    @Primary
    //此处注入的xxxDataSource对应上面xxxDataSource的bean
    public DynamicDataSource dataSource(/*DataSource dataSource*//*, DataSource slaveDataSource*/) {
        Map<Object, Object> targetDataSources = new HashMap<>();
//        targetDataSources.put(DataSourceType.MASTER.name(), dataSource);
//        setDataSource(targetDataSources, DataSourceType.SLAVE.name(), "slaveDataSource");
//        targetDataSources.put(DataSourceType.SLAVE.name(), slaveDataSource);
//        return new DynamicDataSource(dataSource, targetDataSources);
        return new DynamicDataSource(null, targetDataSources);
    }


    /**
     * 设置数据源
     *
     * @param targetDataSources 备选数据源集合
     * @param sourceName        数据源名称
     * @param beanName          bean名称
     */
    public void setDataSource(Map<Object, Object> targetDataSources, String sourceName, String beanName) {
        try {
            DataSource dataSource = SpringUtils.getBean(beanName);
            targetDataSources.put(sourceName, dataSource);
        } catch (Exception e) {
        }
    }
}
