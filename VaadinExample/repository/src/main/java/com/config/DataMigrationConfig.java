package com.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * Created by Abdus Salam on 8/1/2015.
 */

@Configuration
@PropertySource("classpath:flyway.properties")
@Import(DataSourceConfiguration.class)
class DataMigrationConfig {

    @Autowired
    private DataSource dataSource;

    @Value("${flyway.schema.table}")
    private String flywaySchemaTable;

    @Value("${flyway.migration.prefix}")
    private String flywayMigrationPrefix;

    @Value("${flyway.init.description}")
    private String flywayInitDescription;

    @Bean(initMethod = "migrate")
    @Profile("default")
    Flyway flyway() {
        System.out.println("Creating bean for starting");
        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);
        flyway.setTable(flywaySchemaTable);
        flyway.setSqlMigrationPrefix(flywayMigrationPrefix);
        flyway.setBaselineDescription(flywayInitDescription);
        flyway.repair();
        return flyway;
    }
}
