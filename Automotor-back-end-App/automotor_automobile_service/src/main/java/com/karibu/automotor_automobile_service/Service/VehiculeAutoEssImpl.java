package com.karibu.automotor_automobile_service.Service;

import org.springframework.stereotype.Service;

import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeFactory;
import com.karibu.automotor_automobile_service.Entity.AutomobileEssence;
import com.karibu.automotor_automobile_service.Entity.Vehicule;
import com.karibu.automotor_automobile_service.Enum.CapaciteEnergetique;

import lombok.NoArgsConstructor;

 @NoArgsConstructor
public class VehiculeAutoEssImpl extends Ivehicule {
    

    public VehiculeAutoEssImpl(VehiculeFactory v, VehiculeFactory vv) {
        super(v, vv);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean createVehicule(Vehicule vehicule) {
        if(vehicule!=null){
        AutomobileEssence automobile=(AutomobileEssence) factoryVehiculeEssence.getAuto();
        automobile=(AutomobileEssence) vehicule;
        automobile.setMesureCapaciteEnergetique(CapaciteEnergetique.LITTRE);
        getAutomobileRepository().save(automobile);
        return true;
        }else{
            return false; 
        }
    }
    
}
