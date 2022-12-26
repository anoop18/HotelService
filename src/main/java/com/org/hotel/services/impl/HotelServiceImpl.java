package com.org.hotel.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.hotel.entites.Hotel;
import com.org.hotel.exceptions.ResourecNotFoundException;
import com.org.hotel.repositories.HotelRepositories;
import com.org.hotel.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepositories hotelRepositories;

	@Override
	public Hotel create(Hotel hotel) {
     String hotelId =  UUID.randomUUID().toString();
     hotel.setId(hotelId);
   return hotelRepositories.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return hotelRepositories.findAll();
	}

	@Override
	public Hotel getHotel(String hotelId) {
		return hotelRepositories.findById(hotelId).orElseThrow(()-> new ResourecNotFoundException("hotel with given id not found"));
	}

}
