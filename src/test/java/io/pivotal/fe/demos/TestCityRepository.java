package io.pivotal.fe.demos;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Test inspired by:
 * http://www.jayway.com/2014/07/04/integration-testing-a-spring-boot-
 * application/
 * https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-
 * testing.html
 * 
 * @author skazi
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SBootCitiesServiceApplication.class)
//@WebAppConfiguration
@WebIntegrationTest({"server.port:0", "eureka.client.enabled:false"})
public class TestCityRepository {
	@Test
	public void canFetchPaged() {
		//
	}
}
