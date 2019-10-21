package com.springboot.studentdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(basePackages = "com.springboot.studentdemo")
class StudentDemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
