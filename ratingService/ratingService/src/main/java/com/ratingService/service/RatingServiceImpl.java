package com.ratingService.service;

import com.ratingService.entities.RatingEntity;
import com.ratingService.repository.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService{
    @Autowired
    RatingRepo ratingRepo;
    @Override
    public RatingEntity createRating(RatingEntity rating) {
       String ratingId= UUID.randomUUID().toString();
       rating.setRatingId(ratingId);
        return ratingRepo.save(rating);
    }

    @Override
    public List<RatingEntity> getAllRating() {
        return ratingRepo.findAll();
    }

    @Override
    public List<RatingEntity> getRatingByUserId(String userId) {
        return ratingRepo.findByUserId(userId);
    }

    @Override
    public List<RatingEntity> getRatingByHotelId(String hotelId) {
        return ratingRepo.findByHotelId(hotelId);
    }
}
