package estore.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estore.com.entity.Admin;
import estore.com.repository.AdminRepository;


@Service
public class AdminService {
	//instantiates interface using autowired
	@Autowired
	AdminRepository adminRepository;
	
	//code for admin sign-in
	public String signInAdmin(Admin admin) {
		if(adminRepository.signIn(admin.getEmail(), admin.getPassword())!=null) {
			return "success";
		}else {
			return "failure";
		}
	}
}
