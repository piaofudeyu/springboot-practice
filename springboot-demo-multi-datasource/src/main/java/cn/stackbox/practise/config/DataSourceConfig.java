package cn.stackbox.practise.config;

import cn.stackbox.practise.common.DynamicDataSourceResolver;
import cn.stackbox.practise.common.TadalinDataSource;
import com.google.common.collect.Maps;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.Map;


@Configuration
public class DataSourceConfig {


    @Bean
    @Primary
    @DependsOn(value = {"masterDataSource", "slaveDataSource"})
    public DataSource dataSource() {
        DynamicDataSourceResolver resolver = new DynamicDataSourceResolver();

        Map<Object, Object> dataSources = Maps.newHashMap();

        dataSources.put(TadalinDataSource.master, masterDataSource());
        dataSources.put(TadalinDataSource.slave, slaveDataSource());

        resolver.setTargetDataSources(dataSources);
        return resolver;
    }

    @Bean
    @ConfigurationProperties(prefix="spring.datasource.master")
    public DataSource masterDataSource() {
        return new org.apache.tomcat.jdbc.pool.DataSource();
    }

    @Bean
    @ConfigurationProperties(prefix="spring.datasource.slave")
    public DataSource slaveDataSource() {
        return new org.apache.tomcat.jdbc.pool.DataSource();
    }
}
