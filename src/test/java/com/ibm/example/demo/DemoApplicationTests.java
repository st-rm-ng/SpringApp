package com.ibm.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Test
	void testApplicationStartup() {
		Assertions.assertThatCode(DemoApplication::new)
				.doesNotThrowAnyException();
	}

}
