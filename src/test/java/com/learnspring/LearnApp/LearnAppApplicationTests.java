package com.learnspring.LearnApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnAppApplicationTests {

	@Autowired
	private HelloWorldClass hello;

	@Test
	public void test() {

		assertEquals("Hello World",hello.getHelloWorld());


	}

}
