package edu.stackroute.mspatterns.appgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class MspatternsAppGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MspatternsAppGatewayApplication.class, args);
	}
}
