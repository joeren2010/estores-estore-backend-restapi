package estore.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estore.com.repository.OrderRepository;


@Service
public class OrderService {
	//instantiates interface using autowired
	@Autowired
	OrderRepository orderRepository;
}
