package com.hotelService.service;

import com.hotelService.entities.HotelEntity;

import java.util.List;

public interface HotelService {
    HotelEntity create(HotelEntity hotel);
    List<HotelEntity> getAllHotel();
    HotelEntity getHotel(String hotelId);
}
