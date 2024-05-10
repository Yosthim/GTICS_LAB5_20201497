package com.example.gtics_lab6_20201497.repository;

import com.example.gtics_lab6_20201497.entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician, Integer> {
}
