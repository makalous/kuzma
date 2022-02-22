package pl.makalous.kuzma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class KuzmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KuzmaApplication.class, args);
	}

}
