package estore.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import estore.com.entity.Shipment;


@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Integer>{
	//JPQL Query to select shp from your entity class e.g: "Shipment.java"
	@Query("select shp from Shipment shp where shp.shipmentStatus > :shipmentstatus")
	//java method to search shipment by shipmentstatus from list of shipments
	public List<Shipment> searchShipmentByShipmentStatus(@Param("shipmentstatus") int shipmentStatus);
}
