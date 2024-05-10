package com.example.gtics_lab6_20201497.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "technician")
public class Technician {
    @Id
    @Column(name = "technicianid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int technicianId;
    @Column(name = "firstname", nullable = false)
    private String firstName;
    @Column(name = "lastname", nullable = false)
    private String lastName;
    @Column(name = "dni", nullable = false)
    private String dni;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "age", nullable = false)
    private int age;
}
