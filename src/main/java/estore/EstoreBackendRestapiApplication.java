package estore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication (scanBasePackages = "estore")	// Enable @Restcontroller, @Service and @Repository annotation 
@EnableJpaRepositories(basePackages = "estore.com.repository")
@EntityScan(basePackages = "estore.com.entity")		// @Entity classes enable in spring boot 
public class EstoreBackendRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoreBackendRestapiApplication.class, args);
		System.out.println("Server Up");
	}
}
