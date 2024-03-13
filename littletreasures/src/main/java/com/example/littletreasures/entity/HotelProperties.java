package com.example.littletreasures.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class HotelProperties {
	int fileVersion;
	 List<Hotel> Hotels;

}
