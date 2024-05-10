package com.example.gtics_lab6_20201497.repository;

import com.example.gtics_lab6_20201497.entity.Ticket;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
