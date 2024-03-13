package com.example.littletreasures.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.littletreasures.entity.Hotel;
import com.example.littletreasures.service.YmlService;

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

}
