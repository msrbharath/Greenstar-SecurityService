package com.cognizant.outreach.microservices.security.model;

import java.util.List;

public class User {

	private String roleName;

	private String apiToken;

	private List<String> uiMenuList;

	/**
	 * @return
	 */
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getApiToken() {
		return apiToken;
	}

	public void setApiToken(String apiToken) {
		this.apiToken = apiToken;
	}

	public List<String> getUiMenuList() {
		return uiMenuList;
	}

	public void setUiMenuList(List<String> uiMenuList) {
		this.uiMenuList = uiMenuList;
	}

}
