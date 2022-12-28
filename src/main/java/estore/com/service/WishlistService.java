package estore.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estore.com.repository.WishlistRepository;


@Service
public class WishlistService {
	//instantiates interface using autowired
	@Autowired
	WishlistRepository wishlistRepository;
}
