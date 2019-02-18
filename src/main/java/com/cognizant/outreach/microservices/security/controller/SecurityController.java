package com.cognizant.outreach.microservices.security.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.microservices.security.model.User;
import com.cognizant.outreach.microservices.security.service.SecurityService;


@RestController
public class SecurityController {

	protected Logger logger = LoggerFactory.getLogger(SecurityController.class);
	
	@Autowired
	SecurityService authService;
	
	@RequestMapping(method=RequestMethod.POST,path="/auth/validatetoken")
	public ResponseEntity<String> validateAPIToken(@RequestParam(value = "apitoken", required = true) String apiToken,
			@RequestParam(value = "userid", required = true) String userId) {
		if(!authService.isTokenValid(apiToken)) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("API Token is not valid or expired");
		}
		logger.info("Gateway hit with user {} and token {}", userId,apiToken);
		return ResponseEntity.accepted().body("API Token is valid");
	}
	
	@RequestMapping(method=RequestMethod.POST,path="/auth/login")
	public ResponseEntity<User> anthenticateUser(@RequestParam(value = "userId", required = true) String password,
			@RequestParam(value = "password", required = true) String userId) {
		Optional<User> user = authService.initializeUser(userId, password);

		if(!user.isPresent()) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
		}
		logger.info("Login with user {}", userId);
		return ResponseEntity.accepted().body(user.get());
	}
}
