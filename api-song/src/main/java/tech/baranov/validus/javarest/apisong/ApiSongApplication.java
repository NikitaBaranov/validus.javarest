package tech.baranov.validus.javarest.apisong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"tech.baranov.validus.javarest.model"})
public class ApiSongApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSongApplication.class, args);
	}
}
