package com.stackroute.restaurantspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantSpringbootApplication.class, args);
	}
}	
