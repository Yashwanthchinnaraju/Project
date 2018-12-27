package com.niit.EComBack.DAlayer;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EComBack.Model.UserCred;
import com.niit.EComBack.Model.UserDetails;
@Repository
@Transactional
public class UserDetailsDAOimpl implements UserDetailsDAO {

	@Autowired
	SessionFactory sf;
	
	public boolean addCustomer(UserDetails customer) {
		try
		{
			UserCred u=new UserCred();
			u.setEmailId(customer.getEmail_id());
			u.setPassword(customer.getUser_pass());
			u.setRole("USER");
			sf.getCurrentSession().saveOrUpdate(customer);
			sf.getCurrentSession().saveOrUpdate(u);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean updateCustomer(UserDetails customer) 
	{
		try
		{
			sf.getCurrentSession().saveOrUpdate(customer);
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	
	}

	public boolean deleteCustomer(String emailId) 
	{
		try 
		{
			sf.getCurrentSession().delete(showcustomer(emailId));
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}

	public UserDetails showcustomer(String emailId) 
	{
		try
		{
			UserDetails customer=(UserDetails)sf.getCurrentSession().createQuery("from the customer EmailId= '"+emailId+"'").uniqueResult();
			return customer;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	}

	public List<UserDetails> showallcustomer() 
	{ 
		try
		{
	
			ArrayList<UserDetails> customer=(ArrayList<UserDetails>)sf.getCurrentSession().createQuery("From the Customer").list();
			return customer;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
		}
	
	}

	public UserCred showcred(String email) 
	{
		try
		{
		UserCred customer=(UserCred) sf.getCurrentSession().createQuery("From UserCredentials where emailId= '"+email+ "'").uniqueResult();	
		return customer;
		}
		catch(Exception e)
		{
			return null;
		}

	}

	public boolean saveorupdatepassword(UserCred uc) 
	{
		 try
		 {
			 sf.getCurrentSession().saveOrUpdate(uc);
			 return true;
		 }
		 catch(Exception e)
		 {
			 return false;
		 }
	
	}

	
	
}
