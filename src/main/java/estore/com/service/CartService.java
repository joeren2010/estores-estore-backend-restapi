package estore.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estore.com.repository.CartRepository;


@Service
public class CartService {
	//instantiates interface using autowired
	@Autowired
	CartRepository cartRepository;
}
