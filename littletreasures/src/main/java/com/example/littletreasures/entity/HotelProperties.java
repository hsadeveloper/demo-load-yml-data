package com.example.littletreasures.entity;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "treasures")
public class HotelProperties {
	int fileVersion;
	 List<Hotel> hotels;

}
