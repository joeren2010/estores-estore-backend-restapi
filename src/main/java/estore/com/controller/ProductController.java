package estore.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estore.com.entity.Product;
import estore.com.service.ProductService;


@RestController						//use rest-controller for frameworks like angular, etc
@RequestMapping("product") 		//map url to products webpage = http://localhost:9090/product
@CrossOrigin						//to address CORS issues
public class ProductController {
	//instantiates class using autowired
	@Autowired
	ProductService productService;
	
	// http://localhost:9090/product/storeProduct 
	@PostMapping(value = "storeProduct",consumes = MediaType.APPLICATION_JSON_VALUE)	//pass data in json format 
	//@request-body binds the http request values to the entity class
	public String storeProduct(@RequestBody Product product) {
		System.out.println(product);
		return productService.storeProduct(product);
	}
	
	// http://localhost:9090/product/findAllProducts
	@GetMapping(value = "findAllProduct",produces = MediaType.APPLICATION_JSON_VALUE)		//pass data in json format
	public List<Product> findAllProduct() {
		return productService.findAllProduct();
	}
	
	// http://localhost:9090/product/findProductById/1 or // http://localhost:9090/product/findProductById/100
	@GetMapping(value = "findProductById/{pid}")
	//@pathvariable extracts data directly from the uri e.g: pid = 1 or 100 as above
	public String findProductById(@PathVariable("pid") int pid) {
		return productService.findProductById(pid);
	}
	
	// http://localhost:9090/product/findProductByPrice/35000
	@GetMapping(value = "findProductByPrice/{price}")
	//@pathvariable extracts data directly from the uri e.g: price = 35000 as above
	public List<Product> findProductByPrice(@PathVariable("price") int price) {
		return productService.findProductByPrice(price);
	}
	
	// http://localhost:9090/product/updateProduct
	@PutMapping(value = "updateProduct",consumes = MediaType.APPLICATION_JSON_VALUE)		//pass data in json format
	//@request-body binds the http request values to the entity class
	public String updateProduct(@RequestBody Product product) {
		return productService.updateProductDetails(product);
	}
	
	// http://localhost:9090/product/deleteProductById/1
	@DeleteMapping(value = "deleteProductById/{pid}")
	//@pathvariable extracts data directly from the uri e.g: pid = 1 as above
	public String deletetProductById(@PathVariable("pid") int pid) {
		return productService.deleteProductUsingId(pid);
	}
	
	// http://localhost:9090/product/deleteAll
	@DeleteMapping(value = "deleteAll")
	public String deletetAll() {
		return productService.deleteAllProduct();
	}
}
