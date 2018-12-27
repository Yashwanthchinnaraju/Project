package com.niit.EComFront.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.EComBack.DAlayer.CategoryDAO;
import com.niit.EComBack.DAlayer.ProductDAO;
import com.niit.EComBack.Model.Product;

@Controller
public class ProductController {

	@Autowired
	ProductDAO pd;
	
	@Autowired
	CategoryDAO catdao;
	
	
	@RequestMapping("/showoneproduct")
	 public String showoneproductPage(@RequestParam("productName") int productId, Model m)
	 {
	  m.addAttribute("title","Product display");
	  m.addAttribute("productModel", pd.showProduct(productId));
	  m.addAttribute("showoneproductPage",true);
	  return "index";
	 }
	 

	@RequestMapping("/productdisplay")
	 public String productdisplayPage(Model m) 
	 {
	  m.addAttribute("title","Product display");
	  m.addAttribute("prodlist", pd.showallProduct());
	  m.addAttribute("productdisplayPage",true);
	  return "index";
	 }


	
	
	void addimage(MultipartFile f, int id) {
		try {
			String path = "E:\\new test workspace\\EComFront\\src\\main\\webapp\\resources\\pimage\\";//location that u copied
			path = path + String.valueOf(id) + ".jpg";
			if (!f.isEmpty()) {
				byte[] imagebytes = f.getBytes();
				File x = new File(path);
				if (x.exists()) {
					x.delete();
					BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(x));
					bs.write(imagebytes);
					bs.close();
				} else {
					BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(x));
					bs.write(imagebytes);
					bs.close();
				}
			}
			Thread.sleep(5000);
		} catch (Exception e) {

		}	}	
	
	
	
	
	@RequestMapping("/product")
	public String viewProduct(Model m)
	{
		m.addAttribute("productpage", true);
		m.addAttribute("prodmodel", new Product());
		m.addAttribute("prodlist",pd.showallProduct());
		m.addAttribute("catlist", catdao.ViewAllCategory());
		return "index";
		
		
		
	}
	
	@RequestMapping(value = "/productadd", method = RequestMethod.POST)
	public String Addproduct(@Valid @ModelAttribute("prodmodel") Product product, BindingResult result, Model m) {

		if (result.hasErrors()) {
			
			m.addAttribute("product", product);
			m.addAttribute("productpage", true);
			m.addAttribute("prodlist", pd.showallProduct());
			

			return "index";
		} else {
			try {
				pd.addProduct(product);
				addimage(product.getPimage(), product.getProductId());

				return "redirect:/product";
			} catch (Exception e) {
				
				m.addAttribute("product", product);
				m.addAttribute("productpage", true);
				m.addAttribute("prodlist", pd.showallProduct());
				return "index";
			}
		}
	}

	@RequestMapping("/deleteproduct")
	public String deleteProduct(@RequestParam("productId") int productId, Model m) {
		pd.deleteProduct(productId);
		return "redirect:/product";

	}

	@RequestMapping("/editproduct")
	public String editCategory(@RequestParam("productId") int productId, Model m) {
		m.addAttribute("editmode", true);
		m.addAttribute("prodlist", pd.showProduct(productId));
		m.addAttribute("prodlist", pd.showallProduct());
		m.addAttribute("productpage", true);
		m.addAttribute("haserror", false);
		m.addAttribute("error", "");
		return "index";

	}

	
	
	
}
