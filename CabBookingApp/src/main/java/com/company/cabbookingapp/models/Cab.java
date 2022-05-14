package com.company.cabbookingapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cabId;
    private String carType;
    private float perKmRate;

    public Cab() {
    }

    public Cab(int cabId, String carType, float perKmRate) {
        this.cabId = cabId;
        this.carType = carType;
        this.perKmRate = perKmRate;
    }

    public int getCabId() {
        return cabId;
    }

    public void setCabId(int cabId) {
        this.cabId = cabId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public float getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(float perKmRate) {
        this.perKmRate = perKmRate;
    }
}
