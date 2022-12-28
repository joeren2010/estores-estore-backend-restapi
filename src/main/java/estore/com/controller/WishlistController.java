package estore.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estore.com.service.WishlistService;


@RestController						//use rest-controller for frameworks like angular, etc
@RequestMapping("wishlist") 		//map url to wishlist webpage = http://localhost:9090/wishlist
@CrossOrigin						//to address CORS issues
public class WishlistController {
	//instantiates class using autowired
	@Autowired
	WishlistService wishlistService;
}
