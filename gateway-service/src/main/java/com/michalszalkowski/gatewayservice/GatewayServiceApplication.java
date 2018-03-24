package com.michalszalkowski.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}
}

@RestController
class StorageRestController {

	@RequestMapping("/")
	public String hello() {

		String message = new RestTemplate().getForObject("http://article-service:8080", String.class);

		return "Gateway Service Hello !\n -> " + message;
	}

}