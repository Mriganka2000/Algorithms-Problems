package com.company.cabbookingapp.service;

import java.util.List;

import com.company.cabbookingapp.models.TripBooking;
import com.company.cabbookingapp.repository.ITripBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itbs")
public class ITripBookingServiceImpl implements ITripBookingService {

    @Autowired
    ITripBookingRepository tbDao;

    /**
     * @param tripBooking
     * @return TripBooking
     */
    @Override
    public TripBooking insertTripBooking(TripBooking tripBooking) {
        tbDao.saveAndFlush(tripBooking);
        return tripBooking;
    }

    /**
     * @param tripBooking
     * @return TripBooking
     */

    @Override
    public TripBooking updateTripBooking(TripBooking tripBooking) {
        return tbDao.saveAndFlush(tripBooking);
    }

    /**
     * @param tripBooking
     * @return List<TripBooking>
     */

    @Override
    public List<TripBooking> deleteTripBooking(TripBooking tripBooking) {
        tbDao.deleteById(tripBooking.getTripBookingId());
        return tbDao.findAll();
    }

    /**
     * @param customerId
     * @return List<TripBooking>
     */

    @Override
    public List<TripBooking> viewAllTripsCustomer(int customerId) {
        return tbDao.viewAllTripsCustomer(customerId);
    }

    /**
     * @param customerId
     * @return float
     */

    @Override
    public float calculateBill(int customerId) {
        return tbDao.calculateBill(customerId);
    }

    /**
     * @param tripbookingId
     * @return List<TripBooking>
     */

    @Override
    public List<TripBooking> viewAllTripsById(int tripbookingId) {
        // TODO Auto-generated method stub
        return tbDao.viewAllTripsById(tripbookingId);
    }

}