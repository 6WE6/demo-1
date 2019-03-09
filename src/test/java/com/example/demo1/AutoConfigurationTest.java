package com.example.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo1.service.HelloService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutoConfigurationTest {
	
	@Autowired(required=false)
	private HelloService helloService;
	@Test
	public void autoConfigTest() {
		System.out.println(helloService);
	}

}
