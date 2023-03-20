package com.hotelService.controller;

import com.hotelService.entities.HotelEntity;
import com.hotelService.service.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelServiceImpl hotelService;

    @PostMapping
    public ResponseEntity<HotelEntity> createHotel(@RequestBody HotelEntity hotel){
    return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
    }

    @GetMapping
    public ResponseEntity<List<HotelEntity>> getAllHotel(){
        return ResponseEntity.ok(hotelService.getAllHotel());
    }
    @GetMapping("/{hotelId}")
    public ResponseEntity<HotelEntity> getHotel(@PathVariable String hotelId){
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotel(hotelId));
    }
}
