package estore.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estore.com.service.OrderService;


@RestController					//use rest-controller for frameworks like angular, etc
@RequestMapping("order") 		//map url to orders webpage = http://localhost:9090/orders
@CrossOrigin					//to address CORS issues
public class OrderController {
	//instantiates class using autowired
	@Autowired
	OrderService orderService;
}
