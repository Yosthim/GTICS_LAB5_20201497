package com.example.gtics_lab6_20201497.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "location")
public class Location {
    @Id
    @Column(name = "locationid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer locationId;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
}
