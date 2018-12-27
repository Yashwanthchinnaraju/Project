package com.niit.EComBack.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class UserCred {

	@Id
	private String EmailId;
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	private String password;
	private String role;

}
