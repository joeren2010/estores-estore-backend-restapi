package estore.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import estore.com.entity.Cart;


@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{
	//JPQL Query to select crt from your entity class e.g: "Cart.java" 	
	@Query("select crt from Cart crt where crt.quantity > :quantity")
	//java method to search cart by quantity from list of carts
	public List<Cart> searchCartByQuantity(@Param("quantity") int quantity);
}
