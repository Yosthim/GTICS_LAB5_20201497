package com.example.gtics_lab6_20201497.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "device")
public class Device {
    @Id
    @Column(name = "deviceid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer deviceId;
    @Column(name = "devicename")
    private String deviceName;
    @Column(name = "devicetype")
    private String deviceType;
    @Column(name = "model")
    private String model;
    @Column(name = "serialnumber")
    private String serialNumber;
    @ManyToOne
    @JoinColumn(name = "siteid")
    private Site site;
}
