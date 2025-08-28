package com.example.littletreasures.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.littletreasures.entity.Hotel;
import com.example.littletreasures.service.YmlService;

import lombok.Data;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	private YmlService ymlService;
	
	
	
	
	public HotelController(YmlService ymlService) {
		super();
		this.ymlService = ymlService;
	}

	@GetMapping("/")
    public String greeing()  {
        return "Welcome to HotelService";
    }
	
	@GetMapping("/all")
    public List<Hotel> loadJsonData() throws IOException {     
		 List<Hotel> hotel =null;
         return ymlService.getHotels();


    }

	@GetMapping("/search/{name}")
    public List<Hotel> searchHotels(@PathVariable(name = "name") String name)throws IOException  {
		 List<Hotel> hotel= ymlService.getHotels();
		 List<Hotel> filteredHotels = new ArrayList<>();
		 for (Hotel hotels : hotel) {
	            if (hotels.getName().equalsIgnoreCase(name)) {
	                filteredHotels.add(hotels);
	            }
	        }
		 return filteredHotels;
    }
	
	@GetMapping("/search/geographic-order")
    public List<Hotel> grouphHotelsByLocation()throws IOException  {
		 List<Hotel> hotel= ymlService.getHotels();
		 List<Hotel> filteredHotels = new ArrayList<>();
		 for (Hotel hotels : hotel) {
	            if (hotels.getGeographicOrder().equalsIgnoreCase("Center strip")) {
	                filteredHotels.add(hotels);
	            }
	        }
		 return filteredHotels;
    }
	
	// hotels?theme=Asian
	@GetMapping("/theme/{theme}")
	public List<Hotel> getHotelsByTheme(@PathVariable("theme") String theme) {
	     List<Hotel> hotels= ymlService.getHotels();
	     return hotels.stream()
	      .filter(hotel -> hotel.getTheme().toLowerCase().contains(theme.toLowerCase()))
	      .collect(Collectors.toList());
	    }
	}
	


