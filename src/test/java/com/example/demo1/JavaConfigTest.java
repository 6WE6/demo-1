package com.example.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo1.bean.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaConfigTest {
	@Autowired
	private User user;
	@Test
	public void ContentLoad() {
		System.out.println(user);
		System.out.println(user.getGroup());
	}

}
