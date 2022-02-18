package com.example.deviceseller.repository;

import com.example.deviceseller.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
