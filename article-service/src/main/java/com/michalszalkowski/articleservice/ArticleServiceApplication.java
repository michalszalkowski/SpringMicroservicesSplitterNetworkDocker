package com.michalszalkowski.articleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ArticleServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArticleServiceApplication.class, args);
	}
}

@RestController
class ArticleRestController {

	@RequestMapping("/")
	public String hello() {

		String message = new RestTemplate().getForObject("http://storage-service:8080", String.class);

		return "Article Service hello ! \n -> " + message;
	}

}