package com.akshay.rating.service.RatingService.services.impl;

import com.akshay.rating.service.RatingService.entities.Rating;
import com.akshay.rating.service.RatingService.repositories.RatingRepository;
import com.akshay.rating.service.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;


    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatingsByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getAllRatingsByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
