package estore.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import estore.com.service.ShipmentService;


@RestController						//use rest-controller for frameworks like angular, etc
@RequestMapping("shipment") 		//map url to shipments webpage = http://localhost:9090/shipment
@CrossOrigin						//to address CORS issues
public class ShipmentController {
	//instantiates class using autowired
	@Autowired
	ShipmentService shipmentService;
}
