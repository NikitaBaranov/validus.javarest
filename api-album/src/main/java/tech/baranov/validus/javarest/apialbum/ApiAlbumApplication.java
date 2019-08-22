package tech.baranov.validus.javarest.apialbum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EntityScan(basePackages = {"tech.baranov.validus.javarest.model", "tech.baranov.validus.javarest.apialbum.model"})
@EnableFeignClients
public class ApiAlbumApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAlbumApplication.class, args);
	}

}
