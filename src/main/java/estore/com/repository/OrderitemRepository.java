package estore.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import estore.com.entity.Orderitem;


@Repository
public interface OrderitemRepository extends JpaRepository<Orderitem, Integer>{
	//JPQL Query to select itm from your entity class e.g: "Orderitem.java" 
	@Query("select itm from Orderitem itm where itm.price > :price")
	//java method to search orderitem by price from list of orderitems
	public List<Orderitem> searchOrderitemByPrice(@Param("price") int price);
}
