package org.example.feignclientapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
@EnableConfigurationProperties
public class FeignClientApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientApiApplication.class, args);
	}

}
