package com.company.cabbookingapp.dao;

import com.company.cabbookingapp.models.TripBooking;

import java.util.List;

public interface ITripBookingDao {

    List<TripBooking> viewAllTripsCustomer(int customerId);

    float calculateBill(int customerId);

    List<TripBooking> viewAllTripsById(int tripbookingId);

}
