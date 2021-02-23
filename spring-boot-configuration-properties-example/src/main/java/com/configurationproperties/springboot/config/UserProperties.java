package com.configurationproperties.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Configuration
@PropertySource("classpath:custom.properties")
@ConfigurationProperties(prefix="user")
@Validated
@Getter
@Setter
@NoArgsConstructor
public class UserProperties {

	private int id;
	private String name;
	private String lastName;

	
}
