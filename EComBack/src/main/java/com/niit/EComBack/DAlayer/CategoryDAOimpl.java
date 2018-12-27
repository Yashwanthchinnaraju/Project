package com.niit.EComBack.DAlayer;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EComBack.Model.Category;
@Repository("CategoryDAO")
@Transactional
public class CategoryDAOimpl implements CategoryDAO {

	
	@Autowired
	SessionFactory sessionfactory;

	public boolean CreateCategory(Category category) {
		try {
			sessionfactory.getCurrentSession().save(category);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public List<Category> ViewAllCategory() {
		try {
			List<Category> category =(List<Category>) sessionfactory.getCurrentSession().createQuery("From Category").list();
			return category;
		} catch (Exception e) {
			return null;
		}
	}

	public boolean DeleteCategory(String CategoryName) {
		try {
			sessionfactory.getCurrentSession().delete(ViewOneCategory(CategoryName));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Category ViewOneCategory(String CategoryName) {
		try {
			Category category = (Category) sessionfactory.getCurrentSession().createQuery("From  Category where categoryName='"+CategoryName+"'").uniqueResult();
			return category;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean UpdateCategory(Category category) {
		try {
			sessionfactory.getCurrentSession().update(category);
			
			return true;
		}
		catch(Exception e) {
			
			return false;	
		}
		
	}


}
