package com.akshay.hotel.service.HotelService.services;

import com.akshay.hotel.service.HotelService.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HotelService {

    //create
    Hotel createHotel(Hotel hotel);

    //get-all
    public List<Hotel> getAllHotels();

    //get by hotelId
    public Hotel getHotelById(String hotelId);
}
