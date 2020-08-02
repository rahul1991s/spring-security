package com.rahuls.springsecurity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SHU_MY_USER")
public class UserEntity {

	private String userId;
	private String password;
	private String roles;
	private String active;

	public UserEntity() {
	}

	public UserEntity(String userId, String password, String roles, String active) {
		super();
		this.userId = userId;
		this.password = password;
		this.roles = roles;
		this.active = active;
	}

	@Id
	@Column(name = "USER_ID")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "PASS")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "ROLESS")
	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	@Column(name = "ACTIVE")
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
}
