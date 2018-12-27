package com.niit.EComBack.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class UserDetails {

	
	@Column(nullable=false)
	private String User_name;
	
	@Column(nullable=false,unique=true)
	@NotEmpty(message="Email id is mandatory")
	@Pattern(regexp="[A-Za-z0-9]+@[a-z]+\\.[a-z]{2,3}")
	private String email_id;
	
	@Column(nullable=false,unique=true)
	@NotEmpty
	@Pattern(regexp="[6789][0-9]{9}")
	private String Phonenumber;
	
	@Column(nullable=false)
	@NotEmpty(message="user password is mandatory")
	@Pattern(regexp="([a-zA-Z0-9]+{8,12})")
	private String user_pass;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int CartId;

	public String getUser_name() {
		return User_name;
	}

	public void setUser_name(String user_name) {
		User_name = user_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public int getCartId() {
		return CartId;
	}

	public void setCartId(int cartId) {
		CartId = cartId;
	}


	
	
	
	
}
