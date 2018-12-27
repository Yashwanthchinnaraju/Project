//package com.niit.EComBack;
//
//import static org.junit.Assert.assertEquals;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.niit.EComBack.DAlayer.CategoryDAO;
//import com.niit.EComBack.Model.Category;
//
//
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=DBconfig.class)
//public class CategoryTestDAO 
//{	@Autowired
//	CategoryDAO cd;
//	Category category= new Category();
//	
//	@Before
//	public void setUp() throws Exception 
//	{
//	
//		category.setCategoryname("Powerglass");;
//        category.setCategorydesc("plus");	
//	}
//
//	@After	public void tearDown() throws Exception
//	{
//  cd.DeleteCategory("Powerglass");
//	}
//
//	@Test
//	public void test() 
//	{assertEquals("sucess", true, cd.CreateCategory(category));
//		
//		
//	}
//	
//	
//}
