package com.niit.EComBack.DAlayer;

import java.util.List;

import com.niit.EComBack.Model.Category;

public interface CategoryDAO {

	public boolean CreateCategory(Category category);
	public boolean UpdateCategory(Category category);
	public boolean DeleteCategory(String Category_name);
	public List<Category> ViewAllCategory();
	Category ViewOneCategory(String CategoryName);
	
}
