package com.cognizant.outreach.microservices.security.application;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "appconfig")
public class ApplicationProperties {

	/**
	 * Key: userId
	 * Value: password
	 */
	private Map<String, String> users;
	
	private Integer apitimeout;


	public Map<String, String> getUsers() {
		return users;
	}

	public void setUsers(Map<String, String> users) {
		this.users = users;
	}

	public Integer getApitimeout() {
		return apitimeout;
	}

	public void setApitimeout(Integer apitimeout) {
		this.apitimeout = apitimeout;
	}

	
	
}
