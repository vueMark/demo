package com.oreilly.demo;

import org.springframework.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private ApplicationContext context;

	@Test
	void contextLoads() {
		System.out.println("There are " +
				context.getBeanDefinitionCount() +
				" beans in the application context.");

		for(String name: context.getBeanDefinitionNames()){
			System.out.println(name);
		}
	}

}
