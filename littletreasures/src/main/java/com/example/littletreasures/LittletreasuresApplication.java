package com.example.littletreasures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.littletreasures.entity.HotelProperties;
import com.example.littletreasures.service.YmlService;

@SpringBootApplication
public class LittletreasuresApplication implements CommandLineRunner {
	@Autowired
	HotelProperties hotelProperties;
	
	public static void main(String[] args) {
		SpringApplication.run(LittletreasuresApplication.class, args);
	}
	

	@Autowired
	YmlService ymlService;
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Version" + ymlService.getHotels());
	}

}
