package com.config;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * Created by Abdus Salam on 8/1/2015.
 */

@Configuration
@PropertySource("classpath:datasource.properties")
class DataSourceConfiguration {

    @Value("${DRIVER}")
    private String databaseDriverClassName;

    @Value("${USER}")
    private String databaseUsername;

    @Value("${PASS}")
    private String databasePassword;

    @Value("${DATABASE_URL}")
    private String databaseURL;

    @Bean()
  //  @Profile("default")
    DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(databaseDriverClassName);
        dataSource.setPassword(databasePassword);
        dataSource.setUsername(databaseUsername);
        dataSource.setUrl(databaseURL);
        return dataSource;
    }
}
