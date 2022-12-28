package estore.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estore.com.service.CartService;


@RestController					//use rest-controller for frameworks like angular, etc
@RequestMapping("cart") 		//map url to cart webpage = http://localhost:9090/cart
@CrossOrigin					//to address CORS issues
public class CartController {
	//instantiates class using autowired
	@Autowired
	CartService cartService;
}
