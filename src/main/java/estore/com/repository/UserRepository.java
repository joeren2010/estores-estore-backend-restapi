package estore.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import estore.com.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	//JPQL Query to select usr from your entity class e.g: "User.java" 
	@Query("select usr from User usr where usr.email = :emailname and usr.password = :pass")
	//java method to sign-in using email address and password
	public User signIn(@Param("emailname") String email, @Param("pass") String password);
}
