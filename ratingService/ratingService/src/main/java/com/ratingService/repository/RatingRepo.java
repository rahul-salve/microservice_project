package com.ratingService.repository;

import com.ratingService.entities.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepo  extends JpaRepository<RatingEntity,String> {
    List<RatingEntity> findByUserId(String userId);
    List<RatingEntity> findByHotelId(String hotelId);
}
