package com.niit.EComBack.DAlayer;
import com.niit.EComBack.Model.UserDetails;

import java.util.List;

import com.niit.EComBack.Model.UserCred;

public interface UserDetailsDAO {

	public boolean addCustomer(UserDetails customer);
	public boolean updateCustomer(UserDetails customer);
	public boolean deleteCustomer(String emailId);
	public UserDetails showcustomer(String emailId);
	public List<UserDetails> showallcustomer();
	public UserCred showcred(String email);
	public boolean saveorupdatepassword(UserCred uc);
}
