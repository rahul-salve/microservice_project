package com.ratingService.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rating_entity")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RatingEntity {
    @Id
    @Column(name="rating_id")
    private String ratingId;
    @Column(name="user_id")
    private String userId;
    @Column(name="hotel_id")
    private String hotelId;
    private int rating;
    private String feedback;
}
