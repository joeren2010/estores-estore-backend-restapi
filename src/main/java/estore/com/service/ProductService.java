package estore.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estore.com.entity.Product;
import estore.com.repository.ProductRepository;


@Service
public class ProductService {
	//instantiates interface using autowired
	@Autowired
	ProductRepository productRepository;
	
	public String storeProduct(Product product) {
		productRepository.save(product);			//insert query = similar to pojo
		return "Product Details stored successfully";
	}
	
	public List<Product> findAllProduct() {
		return productRepository.findAll();			//select query 
	}
	
	public List<Product> findProductByPrice(int price){
		return productRepository.searchProductByPrice(price);
	}
	
	public String findProductById(int productid) {
		//using "optional" method
		Optional<Product> result = productRepository.findById(productid);			//using primary key
		if(result.isPresent()) {
			Product pp = result.get();
			return pp.toString();
		}else {
			return "Product not present";
		}
	}
	
	public String updateProductDetails(Product product) {
		//using "optional" method
		Optional<Product> result = productRepository.findById(product.getProductId());		//using primary key
		if(result.isPresent()) {
			Product pp	= result.get();
			pp.setPrice(product.getPrice());
			/*
			 * 	we can update more property 
			 * 
			 */
			productRepository.saveAndFlush(pp);			//flush = clears-out the repo of any buffer data
			return "Product Details updated successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String deleteProductUsingId(int productid) {
		//using "optional" method
		Optional<Product> result = productRepository.findById(productid);              //using primary key
		if(result.isPresent()) {
			Product pp = result.get();
			productRepository.deleteById(pp.getProductId());
			return "Product details deleted successfully";
		}else {
			return "Product not present";
		}
	}
	
	public String deleteAllProduct() {
		productRepository.deleteAll();
		return "Add product deleted";
	}
}
