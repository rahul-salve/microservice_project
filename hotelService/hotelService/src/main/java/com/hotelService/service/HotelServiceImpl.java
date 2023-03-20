package com.hotelService.service;

import com.hotelService.Exception.ResourceNotFoundException;
import com.hotelService.entities.HotelEntity;
import com.hotelService.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelRepository hotelRepository;
    @Override
    public HotelEntity create(HotelEntity hotel) {
       String hotelId= UUID.randomUUID().toString();
       hotel.setHotelId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<HotelEntity> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public HotelEntity getHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("Hotel with given id not found !!"));
    }
}
