package estore.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import estore.com.entity.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	//JPQL Query to select prd from your entity class e.g: "Product.java" 
	@Query("select prd from Product prd where prd.price > :price")
	//java method to search product by price from list of products
	public List<Product> searchProductByPrice(@Param("price") int price);
}
