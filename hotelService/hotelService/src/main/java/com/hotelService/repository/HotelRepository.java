package com.hotelService.repository;

import com.hotelService.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity,String> {
}
