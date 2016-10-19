package com.config;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * Created by Abdus Salam on 8/1/2015.
 */

@Configuration
@PropertySource("classpath:datasource.properties")
class DataSourceConfiguration {

    @Value("${driver}")
    private String databaseDriverClassName;

    @Value("${pass}")
    private String databasePassword;

    @Value("${user}")
    private String databaseUsername;

    @Value("${databaseurl}")
    private String databaseURL;

    @Bean(destroyMethod = "close")
    @Profile("default")
    DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(databaseDriverClassName);
        dataSource.setPassword(databasePassword);
        dataSource.setUsername(databaseUsername);
        dataSource.setUrl(databaseURL);
        return dataSource;
    }
}
