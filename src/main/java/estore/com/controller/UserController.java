package estore.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estore.com.service.UserService;


@RestController					//use rest-controller for frameworks like angular, etc
@RequestMapping("user") 		//map url to users webpage = http://localhost:9090/user
@CrossOrigin					//to address CORS issues
public class UserController {
	//instantiates class using autowired
	@Autowired
	UserService userService;
}
