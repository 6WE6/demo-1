package com.example.demo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo1.bean.Group;
import com.example.demo1.bean.User;

@Configuration
public class AppConfig {
	@Bean
	public User user() {
		return new User();
	}

	@Bean
	public Group group() {
		return new Group();
	}
}
