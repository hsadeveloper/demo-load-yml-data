package com.example.littletreasures.service;


import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.example.littletreasures.entity.Hotel;

@Component
@ConfigurationProperties(prefix = "treasures")
public class YmlService {

    private String version;
    List<Hotel> HotelProperties;

    public List<Hotel> getHotels() {
        return HotelProperties;
    }

    public void setHotels(List<Hotel> hotels) {
        this.HotelProperties = hotels;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

	
}