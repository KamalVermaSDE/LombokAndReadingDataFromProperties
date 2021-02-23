package com.configurationproperties.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

import com.configurationproperties.springboot.config.UserProperties;
import com.configurationproperties.springboot.service.UserService;

@SpringBootApplication
@EnableConfigurationProperties(UserProperties.class)
public class SpringBootApp {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(SpringBootApp.class, args);
    UserService userService = context.getBean(UserService.class);
    userService.print();
  }
  
}
