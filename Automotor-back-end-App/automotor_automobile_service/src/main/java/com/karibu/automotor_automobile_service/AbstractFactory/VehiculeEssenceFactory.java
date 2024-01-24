package com.karibu.automotor_automobile_service.AbstractFactory;

import org.springframework.stereotype.Service;

import com.karibu.automotor_automobile_service.Entity.Automobile;
import com.karibu.automotor_automobile_service.Entity.AutomobileEssence;
import com.karibu.automotor_automobile_service.Entity.Scooter;
import com.karibu.automotor_automobile_service.Entity.ScooterEssence;
@Service 
public class VehiculeEssenceFactory implements VehiculeFactory {

    @Override
    public Automobile getAuto() {
        return new AutomobileEssence();
    }

    @Override
    public Scooter getScooter() {
        return new ScooterEssence();
    }
  
}
