package com.company.cabbookingapp.repository;

import com.company.cabbookingapp.dao.ITripBookingDao;
import com.company.cabbookingapp.models.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tbDao")
public interface ITripBookingRepository extends ITripBookingDao, JpaRepository<TripBooking, Integer> {

}
