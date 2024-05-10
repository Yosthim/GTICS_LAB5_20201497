package com.example.gtics_lab6_20201497.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @Column(name = "locationid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int locationId;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
}
