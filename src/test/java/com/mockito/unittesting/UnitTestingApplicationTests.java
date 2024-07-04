package com.mockito.unittesting;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
//We can add a specific test properties file or override existing
@TestPropertySource(locations={"classpath:test-configuration.properties"})
class UnitTestingApplicationTests {

	@Test
	void contextLoads() {
	}

}
