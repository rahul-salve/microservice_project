package com.userService.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelEntity {

    private String hotelId;
    private String hotelName;
    private String location;
    private String about;

}
