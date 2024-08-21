package com.phegondev.PhegonHotel;

import com.phegondev.PhegonHotel.service.AwsS3Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PhegonHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhegonHotelApplication.class, args);
	}

	@Bean
	public AwsS3Service awsS3Service() {
		return new AwsS3Service();
	}

}
