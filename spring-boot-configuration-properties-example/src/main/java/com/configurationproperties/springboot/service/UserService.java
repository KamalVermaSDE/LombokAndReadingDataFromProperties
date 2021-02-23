package com.configurationproperties.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.configurationproperties.springboot.config.UserProperties;

@Component
public class UserService {
  
  @Autowired
  private UserProperties userProperties;
  
  @Value("${user.password}")
  String hibernateconfig;

  public void print() {
	  
	  
    System.out.println("id = " + hibernateconfig);
    System.out.println("Name = " + userProperties.getName());
    System.out.println("LastName = " + userProperties.getLastName());
    System.out.println();
    
    
  }
}
