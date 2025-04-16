package com.akshay.hotel.service.HotelService.services.impl;

import com.akshay.hotel.service.HotelService.entities.Hotel;
import com.akshay.hotel.service.HotelService.exceptions.ResourceNotFoundException;
import com.akshay.hotel.service.HotelService.repositories.HotelRepository;
import com.akshay.hotel.service.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found !! " + hotelId));
    }
}
