package com.company.cabbookingapp.service;

import com.company.cabbookingapp.exception.DriverNotFoundException;
import com.company.cabbookingapp.models.Driver;

import java.util.List;

public interface IDriverService {
    List<Driver> displayAllDriver();

    Driver viewDriver(int driverId) throws DriverNotFoundException;

    List<Driver> viewBestDrivers() throws DriverNotFoundException;

    List<Driver> insertDriver(Driver driver);

    Driver updateDriver(Driver driver) throws DriverNotFoundException;

    List<Driver> deleteDriver(int driverId) throws DriverNotFoundException;
}
