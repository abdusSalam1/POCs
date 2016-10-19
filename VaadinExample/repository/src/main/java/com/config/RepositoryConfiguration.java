package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Abdus Salam on 9/24/2016.
 */
@Configuration
@Import({DataSourceConfiguration.class, DataMigrationConfig.class})
public class RepositoryConfiguration {
}
