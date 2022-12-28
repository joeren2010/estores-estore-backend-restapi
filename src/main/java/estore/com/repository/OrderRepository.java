package estore.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import estore.com.entity.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	//JPQL Query to select ord from your entity class e.g: "Order.java" 	
	@Query("select ord from Order ord where ord.name > :name")
	//java method to search order by name from list of orders
	public List<Order> searchOrderByName(@Param("name") String name);
}
