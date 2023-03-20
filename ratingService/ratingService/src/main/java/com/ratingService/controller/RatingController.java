package com.ratingService.controller;

import com.ratingService.entities.RatingEntity;
import com.ratingService.service.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    RatingServiceImpl ratingService;

    @PostMapping
    public ResponseEntity<RatingEntity> createRating(@RequestBody RatingEntity rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<RatingEntity>> getRatingsByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<RatingEntity>> getRatingsByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }

    @GetMapping
    public ResponseEntity<List<RatingEntity>> getAllRatings() {
        return ResponseEntity.ok(ratingService.getAllRating());
    }
}