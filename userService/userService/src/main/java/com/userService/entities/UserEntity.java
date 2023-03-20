package com.userService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user_entity")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @Column(name="user_id")
    private String userId;
    @Column(name="user_name")
    private String userName;
    private String email;
    private String about;
    @Transient
    private List<Rating> ratings=new ArrayList<>();
}
