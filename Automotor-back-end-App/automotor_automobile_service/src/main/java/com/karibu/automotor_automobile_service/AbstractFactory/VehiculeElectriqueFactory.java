package com.karibu.automotor_automobile_service.AbstractFactory;

import org.springframework.stereotype.Service;

import com.karibu.automotor_automobile_service.Entity.Automobile;
import com.karibu.automotor_automobile_service.Entity.AutomobileElectrique;
import com.karibu.automotor_automobile_service.Entity.Scooter;
import com.karibu.automotor_automobile_service.Entity.ScooterElectrique;

@Service
public class VehiculeElectriqueFactory implements VehiculeFactory {

    @Override
    public Automobile getAuto() {
        return new AutomobileElectrique();
    }

    @Override
    public Scooter getScooter() {
        return new ScooterElectrique();
    }

    
}
