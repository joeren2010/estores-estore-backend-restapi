package estore.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estore.com.repository.OrderitemRepository;


@Service
public class OrderitemService {
	//instantiates interface using autowired
	@Autowired
	OrderitemRepository orderitemRepository;
}
