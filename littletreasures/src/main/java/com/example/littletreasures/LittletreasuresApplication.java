package com.example.littletreasures;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.littletreasures.entity.Hotel;
import com.example.littletreasures.entity.HotelProperties;

@SpringBootApplication
public class LittletreasuresApplication implements CommandLineRunner {
	@Autowired
	HotelProperties hotelProperties;
	
	public static void main(String[] args) {
		SpringApplication.run(LittletreasuresApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
        // Access the values from the YAML file
        int fileVersion = hotelProperties.getFileVersion();
        List<Hotel> hotels = hotelProperties.getHotels();

     
        for (Hotel hotel : hotels) {
            System.out.println("Hotel Name: " + hotel.getName());
            System.out.println("Hotel Address: " + hotel.getAddress());
            // Print other hotel properties
        }
    }

}
