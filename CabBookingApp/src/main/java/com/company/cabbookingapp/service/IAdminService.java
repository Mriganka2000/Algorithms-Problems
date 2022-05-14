package com.company.cabbookingapp.service;

import com.company.cabbookingapp.exception.CustomerNotFoundException;
import com.company.cabbookingapp.models.Admin;
import com.company.cabbookingapp.models.TripBooking;

import java.time.LocalDateTime;
import java.util.List;

public interface IAdminService {
    Admin insertAdmin(Admin admin);

    Admin updateAdmin(Admin admin);

    List<Admin> deleteAdmin(int adminId);

    List<TripBooking> getAllTrips(int customerId) throws CustomerNotFoundException;

    List<TripBooking> getTripsCabwise();

    List<TripBooking> getTripsCustomerwise();

    List<TripBooking> getTripsDatewise();

    List<TripBooking> getAllTripsForDays(int customerId, LocalDateTime fromDate, LocalDateTime toDate)
            throws CustomerNotFoundException;

    List<Admin> viewALlAdmin();

    Admin getAdminById(int adminId);
}
