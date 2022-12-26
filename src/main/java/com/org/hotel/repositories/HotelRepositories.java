package com.org.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.hotel.entites.Hotel;

public interface HotelRepositories extends JpaRepository<Hotel, String> {

}
