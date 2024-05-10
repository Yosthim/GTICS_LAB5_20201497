package com.example.gtics_lab6_20201497.repository;

import com.example.gtics_lab6_20201497.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Integer> {
}
