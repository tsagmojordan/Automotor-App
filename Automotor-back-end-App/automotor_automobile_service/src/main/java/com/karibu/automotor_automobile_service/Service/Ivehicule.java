package com.karibu.automotor_automobile_service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.stereotype.Service;

import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeElectriqueFactory;
import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeEssenceFactory;
import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeFactory;
import com.karibu.automotor_automobile_service.Dao.AutomobileRepository;
import com.karibu.automotor_automobile_service.Dao.ScooterRepository;
import com.karibu.automotor_automobile_service.Dao.VehiculeRepository;
import com.karibu.automotor_automobile_service.Entity.Automobile;
import com.karibu.automotor_automobile_service.Entity.AutomobileElectrique;
import com.karibu.automotor_automobile_service.Entity.AutomobileEssence;
import com.karibu.automotor_automobile_service.Entity.Scooter;
import com.karibu.automotor_automobile_service.Entity.ScooterElectrique;
import com.karibu.automotor_automobile_service.Entity.ScooterEssence;
import com.karibu.automotor_automobile_service.Entity.Vehicule;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 @Setter @Getter @NoArgsConstructor @Service
public abstract class Ivehicule {
  
    @Autowired protected VehiculeFactory factoryVehiculeElectrique=new VehiculeElectriqueFactory();
    @Autowired protected VehiculeFactory factoryVehiculeEssence=new VehiculeEssenceFactory();
    @Autowired private AutomobileRepository automobileRepository;
    @Autowired private ScooterRepository scooterRepository;
    @Autowired private VehiculeRepository vehiculeRepository;

    public static final int AUTOMOBILE_ELECTRIQUE=1;
    public static final int AUTOMOBILE_ESSENCE=2;
    public static final int SCOOTER_ESSENCE=3;
    public static final int SCOOTER_ELECTRIQUE=4;

    public Ivehicule(VehiculeFactory v,VehiculeFactory vv){
        this.factoryVehiculeElectrique=v;
        this.factoryVehiculeEssence=vv;
    }

    public abstract boolean createVehicule(Vehicule vehicule);


    public Vehicule readVehicule(String id){
        Vehicule vehicule=vehiculeRepository.findById(id).get();
            switch (vehicule.getVehiculeType()) {
                case AUTOMOBILE_ELECTRIQUE:
                   AutomobileElectrique autoElec= ((AutomobileElectrique)vehicule);
                   return autoElec;
                case AUTOMOBILE_ESSENCE:
                    AutomobileEssence autoEss=((AutomobileEssence)vehicule);                  
                    return autoEss;
                case SCOOTER_ELECTRIQUE:
                    ScooterElectrique scooterElec=((ScooterElectrique)vehicule);                
                    return scooterElec; 
                case SCOOTER_ESSENCE:
                ScooterEssence scooterEss=((ScooterEssence)vehicule);
                return scooterEss;   
                default:
                    return null;
                    
            }
        
    }

    
    /* public void updateVehicule(String id,Vehicule vehicule);
    public void deleteVehicule(String id); */

}
