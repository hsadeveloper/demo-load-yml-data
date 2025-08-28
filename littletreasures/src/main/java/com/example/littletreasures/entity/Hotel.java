package com.example.littletreasures.entity;

import java.util.List;

import hotel_reservations.domain.Date;
import hotel_reservations.domain.Id;
import hotel_reservations.domain.String;
import lombok.Data;


@Data
public class Hotel {
	String name;
	String address;
	String image;
	int rooms;
	String opened;
	String operator;
	String theme;
	List<String> architects;
	String geographicOrder;

}
