package com.company.cabbookingapp.dao;

import com.company.cabbookingapp.exception.CabNotFoundException;
import com.company.cabbookingapp.models.Cab;

import java.util.List;

public interface ICabDao {
    List<Cab> viewCabsOfType(String carType) throws CabNotFoundException;

    int countCabsOfType(String carType) throws CabNotFoundException;
}
