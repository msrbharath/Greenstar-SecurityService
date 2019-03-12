/**
 * ${AdminController}
 *
 *  2019 Cognizant Technology Solutions. All Rights Reserved.
 *
 *  This software is the confidential and proprietary information of Cognizant Technology
 *  Solutions("Confidential Information").  You shall not disclose or use Confidential
 *  Information without the express written agreement of Cognizant Technology Solutions.
 *  Modification Log:
 *  -----------------
 *  Date                   Author           Description
 *  09/Mar/2019            Panneer        	Developed base code structure
 *  ---------------------------------------------------------------------------
 */
package com.cognizant.outreach.microservices.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.outreach.microservices.security.vo.UserRoleMappingVO;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping(method = RequestMethod.POST, path = "/admin/userrolemappings")
	public ResponseEntity<UserRoleMappingVO> generatePerformanceStar() {

		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
}
