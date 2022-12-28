package estore.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import estore.com.repository.ShipmentRepository;


@Service
public class ShipmentService {
	//instantiates interface using autowired
	@Autowired
	ShipmentRepository shipmentRepository;
}
