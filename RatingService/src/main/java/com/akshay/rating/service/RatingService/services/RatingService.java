package com.akshay.rating.service.RatingService.services;

import com.akshay.rating.service.RatingService.entities.Rating;

import java.util.List;

public interface RatingService {

    //create rating
    Rating createRating(Rating rating);

    //get all ratings
    List<Rating> getAllRatings();

    //get all ratings of a user
    List<Rating> getAllRatingsByUserId(String userId);

    //get all ratings of a hotel
    List<Rating> getAllRatingsByHotelId(String hotelId);
}
