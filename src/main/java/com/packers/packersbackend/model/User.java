package com.packers.packersbackend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "userDetails")
@Getter
@Setter
public class User {

    @Id
    private Long id;

    private String username;
    private String password;

}
