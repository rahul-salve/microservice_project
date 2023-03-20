package com.ratingService.service;

import com.ratingService.entities.RatingEntity;

import java.util.List;

public interface RatingService {
    RatingEntity createRating(RatingEntity rating);
    List<RatingEntity> getAllRating();
    List<RatingEntity> getRatingByUserId(String userId);
    List<RatingEntity> getRatingByHotelId(String hotelId);

}
