package com.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * Created by Abdus Salam on 8/1/2015.
 */
@Configuration
@PropertySource("classpath:jpa.properties")
@Import(DataSourceConfiguration.class)
class JPAConfiguration {

    @Value("${platform}")
    private String databasePlatform;

    @Value("${showsql}")
    private boolean showSQL = true;

    @Autowired
    private DataSource dataSource;

    @Bean
    @DependsOn("flyway")
    @Profile("default")
    EntityManagerFactory entityManagerFactory() {

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setDatabasePlatform(databasePlatform);
        vendorAdapter.setDatabase(Database.MYSQL);
        vendorAdapter.setShowSql(showSQL);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setDataSource(dataSource);
        factory.afterPropertiesSet();

        return factory.getObject();
    }
}
