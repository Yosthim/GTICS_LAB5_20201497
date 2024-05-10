package com.example.gtics_lab6_20201497.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "site")
public class Site {
    @Id
    @Column(name = "siteid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer siteId;
    @Column(name = "sitename")
    private String siteName;
    @ManyToOne
    @JoinColumn(name = "locationid")
    private Location location;
    @Column(name = "installationdate")
    private LocalDate installationDate;
    @Column(name = "latitude")
    private String latitude;
    @Column(name = "longitude")
    private String longitude;
}
