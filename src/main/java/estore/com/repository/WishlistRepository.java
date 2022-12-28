package estore.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import estore.com.entity.Wishlist;


@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Integer>{
	//JPQL Query to select wsh from your entity class e.g: "Wishlist.java" 
	@Query("select wsh from Wishlist wsh where wsh.userId > :userid")
	//java method to search wishlist by userid from list of wishlists
	public List<Wishlist> searchWishlistByUserId(@Param("userid") int userId);
}
