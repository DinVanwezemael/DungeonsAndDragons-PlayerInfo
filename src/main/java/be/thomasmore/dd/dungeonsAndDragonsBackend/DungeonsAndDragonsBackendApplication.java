package be.thomasmore.dd.dungeonsAndDragonsBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DungeonsAndDragonsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(DungeonsAndDragonsBackendApplication.class, args);
	}

}
