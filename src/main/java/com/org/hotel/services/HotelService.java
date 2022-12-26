package com.org.hotel.services;

import java.util.List;

import com.org.hotel.entites.Hotel;

public interface HotelService {
	
	Hotel create(Hotel hotel);
	
	List<Hotel> getAll();
	
	Hotel getHotel(String id);

}
