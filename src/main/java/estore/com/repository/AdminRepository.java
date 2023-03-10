package estore.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import estore.com.entity.Admin;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{
	//JPQL Query to select adm from your entity class e.g: "Admin.java" 
	@Query("select adm from Admin adm where adm.email = :emailname and adm.password = :pass")
	//java method to sign-in using email address and password
	public Admin signIn(@Param("emailname") String email, @Param("pass") String password);
}
