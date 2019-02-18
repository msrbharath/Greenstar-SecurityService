package com.cognizant.outreach.microservices.secutiry.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.cognizant.outreach.microservices.security.controller.SecurityController;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SecurityControllerTest {
	
	MockMvc mockMvc;
	
	@Mock
	private SecurityController securityServiceController;

	@Autowired
	private TestRestTemplate template;

	@Before
	public void setup() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(securityServiceController).build();
	}

	//Example for get method
	@Test
	public void testFindByUserId() throws Exception {
		//ResponseEntity<User> response = template.getForEntity("/user/magesh",User.class);
		//Assert.assertEquals("admin", response.getBody().getRoleName());
		//Assert.assertEquals(HttpStatus.NOT_FOUND.value(), response.getStatusCode().value());
	}
	
	//Example for post method
	@Test
	public void testFindByUser() throws Exception {
		//HttpEntity<Object> userJson = getHttpEntity("{\"userId\": \"magesh\"}");

		//ResponseEntity<User> response = template.postForEntity("/user", userJson, User.class);

		//Assert.assertEquals("admin", response.getBody().getRoleName());
		//Assert.assertEquals(200, response.getStatusCode().value());
	}
	
	
	private HttpEntity<Object> getHttpEntity(Object body) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return new HttpEntity<Object>(body, headers);
	}
	
}

