package com.company.cabbookingapp.dao;

import com.company.cabbookingapp.exception.CustomerNotFoundException;
import com.company.cabbookingapp.models.TripBooking;

import java.time.LocalDateTime;
import java.util.List;

public interface IAdminDao {
    List<TripBooking> getAllTrips(int customerId) throws CustomerNotFoundException;

    List<TripBooking> getTripsCabwise();

    List<TripBooking> getTripsCustomerwise();

    List<TripBooking> getTripsDatewise();

    List<TripBooking> getAllTripsForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate)
            throws CustomerNotFoundException;
}
