package com.hotelService.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hotel_entity")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HotelEntity {
    @Id
    @Column(name="hotel_id")
    private String hotelId;
    @Column(name="hotel_name")
    private String hotelName;
    private String location;
    private String about;

}
