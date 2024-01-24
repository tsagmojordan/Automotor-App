package com.karibu.automotor_automobile_service.AbstractFactory;

import com.karibu.automotor_automobile_service.Entity.Automobile;
import com.karibu.automotor_automobile_service.Entity.Scooter;


public interface VehiculeFactory {

     Automobile getAuto();
     Scooter getScooter();
}