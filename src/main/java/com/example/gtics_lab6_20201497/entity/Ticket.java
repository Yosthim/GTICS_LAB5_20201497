package com.example.gtics_lab6_20201497.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @Column(name = "ticketid", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;
    @ManyToOne
    @JoinColumn(name = "siteid")
    private Site site;
    @ManyToOne
    @JoinColumn(name = "technicianid")
    private Technician technician;
    @Column(name = "status")
    private String status;
    @Column(name = "openeddate")
    private LocalDateTime openedDate;
    @Column(name = "closeddate")
    private LocalDateTime closedDate;
}
