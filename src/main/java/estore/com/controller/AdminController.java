package estore.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estore.com.entity.Admin;
import estore.com.service.AdminService;


@RestController					//use rest-controller for frameworks like angular, etc
@RequestMapping("admin") 		//map url to admins webpage = http://localhost:9090/admins
@CrossOrigin					//to address CORS issues
public class AdminController {
	//instantiates class using autowired
	@Autowired
	AdminService adminService;
	
	
	//code for admin sign-in
	//map url to admin sign-in webpage = http://localhost:9090/admins/signIn
	@PostMapping(value = "signIn")		
	//@request-body binds the http request values to the entity class
	public String signInAdmin(@RequestBody Admin admin) {
		return adminService.signInAdmin(admin);
	}
}
