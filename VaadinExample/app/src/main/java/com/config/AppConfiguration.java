package com.config;

import com.service.UserService;
import com.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Click Chain on 9/14/2016.
 */
@Configuration
@ComponentScan({"com.service"})
public class AppConfiguration {

  @Bean
  public UserService userService() {
    return new UserServiceImpl();
  }
}
