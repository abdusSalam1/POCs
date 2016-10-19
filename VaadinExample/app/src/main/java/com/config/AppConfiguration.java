package com.config;

import com.vaadin.spring.annotation.EnableVaadin;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Abdus Salam on 9/14/2016.
 */

@EnableVaadin
@Configuration
@Import({ServiceConfiguration.class})
public class AppConfiguration {
}
