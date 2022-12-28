package estore.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estore.com.repository.UserRepository;


@Service
public class UserService {
	//instantiates interface using autowired
	@Autowired
	UserRepository userRepository;
}
