/**
 * 
 */
package com.cognizant.outreach.microservices.security.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.cognizant.outreach.entity.ApiToken;

/**
 * @author crossover
 *
 */
@RestResource(exported = false)
public interface APITokenRepository extends CrudRepository<ApiToken, String> {
	
	public Optional<ApiToken> findByToken(String token);
}
