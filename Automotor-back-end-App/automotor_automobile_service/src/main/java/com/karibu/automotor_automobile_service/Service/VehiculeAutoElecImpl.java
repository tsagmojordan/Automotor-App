package com.karibu.automotor_automobile_service.Service;

import org.springframework.stereotype.Service;
import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeFactory;
import com.karibu.automotor_automobile_service.Entity.AutomobileElectrique;
import com.karibu.automotor_automobile_service.Entity.Vehicule;
import com.karibu.automotor_automobile_service.Enum.CapaciteEnergetique;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class VehiculeAutoElecImpl extends Ivehicule{

    public VehiculeAutoElecImpl(VehiculeFactory v, VehiculeFactory vv) {
        super(v, vv);
        //TODO Auto-generated constructor stub
    }

    @Override
    public boolean createVehicule(Vehicule vehicule) {
        if(vehicule!=null){
            AutomobileElectrique automobile=(AutomobileElectrique) factoryVehiculeElectrique.getAuto();
        automobile=(AutomobileElectrique) vehicule;
        automobile.setMesureCapaciteEnergetique(CapaciteEnergetique.KILOWATT);
        getAutomobileRepository().save(automobile);
        return true;
        }else{
            return false; 
        }
        
    }
    
}
