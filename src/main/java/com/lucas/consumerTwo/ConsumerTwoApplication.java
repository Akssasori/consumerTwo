package com.lucas.consumerTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumerTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerTwoApplication.class, args);
	}

}
