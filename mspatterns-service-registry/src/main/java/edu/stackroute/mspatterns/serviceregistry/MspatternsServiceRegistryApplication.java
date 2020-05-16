package edu.stackroute.mspatterns.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MspatternsServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MspatternsServiceRegistryApplication.class, args);
	}

}
