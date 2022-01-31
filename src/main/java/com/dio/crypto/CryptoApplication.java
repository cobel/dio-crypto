package com.dio.crypto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients
@SpringBootApplication
public class CryptoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CryptoApplication.class, args);
	}

}
