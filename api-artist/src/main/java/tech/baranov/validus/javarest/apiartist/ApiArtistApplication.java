package tech.baranov.validus.javarest.apiartist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EntityScan(basePackages = {"tech.baranov.validus.javarest.model"})
@EnableFeignClients
public class ApiArtistApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiArtistApplication.class, args);
	}

}
