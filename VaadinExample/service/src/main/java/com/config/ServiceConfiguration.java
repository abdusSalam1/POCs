package com.config;

import com.service.UserService;
import com.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Abdus Salam on 10/2/2016.
 */

@Configuration
@Import({RepositoryConfiguration.class})
public class ServiceConfiguration {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }
}
