package estore.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estore.com.service.OrderitemService;


@RestController						//use rest-controller for frameworks like angular, etc
@RequestMapping("orderitem") 		//map url to orderitems webpage = http://localhost:9090/orderitems
@CrossOrigin						//to address CORS issues
public class OrderitemController {
	//instantiates class using autowired
	@Autowired
	OrderitemService orderitemService;
}
