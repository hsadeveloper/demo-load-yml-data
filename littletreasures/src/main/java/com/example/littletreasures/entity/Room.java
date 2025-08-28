package com.example.littletreasures.entity;

import org.springframework.data.annotation.Id;

public class Room {
	
	@Id
	private int roomId;
	private String roomType;
	private int capacity;
	private float price;
	private boolean isAvailable;
	private int roomsLeft;
	private String sideView;
	
	public Room() {
		super();
	}
	public Room(String roomType, int capacity, float price, boolean isAvailable, int roomsLeft, String sideView) {
		super();
		this.roomType = roomType;
		this.capacity = capacity;
		this.price = price;
		this.isAvailable = isAvailable;
		this.roomsLeft = roomsLeft;
		this.sideView = sideView;
	}

	public int getRoomId() {
		return roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public int getCapacity() {
		return capacity;
	}

	public float getPrice() {
		return price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public int getRoomsLeft() {
		return roomsLeft;
	}

	public String getSideView() {
		return sideView;
	}


}
