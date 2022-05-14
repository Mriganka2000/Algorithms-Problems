package com.company.cabbookingapp.service;

import com.company.cabbookingapp.models.TripBooking;

import java.util.List;

public interface ITripBookingService {
    TripBooking insertTripBooking(TripBooking tripBooking);

    TripBooking updateTripBooking(TripBooking tripBooking);

    List<TripBooking> deleteTripBooking(TripBooking tripBooking);

    List<TripBooking> viewAllTripsCustomer(int customerId);

    float calculateBill(int customerId);

    List<TripBooking> viewAllTripsById(int tripbookingId);
}
