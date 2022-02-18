package com.example.deviceseller.service;

import com.example.deviceseller.model.Device;

import java.util.List;

public interface DeviceService {
    Device saveDevice(Device device);

    void deleteDevice(Long id);

    List<Device> findAllDevices();
}
