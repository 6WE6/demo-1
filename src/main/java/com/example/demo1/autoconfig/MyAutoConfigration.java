package com.example.demo1.autoconfig;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo1.service.HelloService;
import com.example.demo1.service.HelloServiceImpl;

@Configuration
@AutoConfigureAfter(HelloService.class)
@ConditionalOnProperty(prefix = "my.service.hello", value = "enabled", havingValue = "true", matchIfMissing = false)
public class MyAutoConfigration {
	
	@Bean
	public HelloService helloService() {
		return new HelloServiceImpl();
	}

}
