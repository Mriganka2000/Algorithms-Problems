package com.company.cabbookingapp.service;

import com.company.cabbookingapp.models.Cab;

import java.util.List;

public interface ICabService {
    Cab insertCab(Cab cab);

    Cab updateCab(Cab cab);

    Cab deleteCab(Cab cab);

    List<Cab> viewCabsOfType(String carType);

    int countCabsOfType(String carType);

    Cab getCabById(int cabID);

    List<Cab> deleteCabById(int cabID);

}
