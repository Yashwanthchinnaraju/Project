package com.niit.EComBack.DAlayer;

import java.util.List;

import com.niit.EComBack.Model.Product;

public interface ProductDAO {
	public boolean addProduct(Product product);
	public boolean deleteProduct(int productid);
	public Product showProduct(int productid);
	public List<Product> showallProduct();
	public List<Product> searchCatogory(int catid);

}
