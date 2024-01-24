/*package com.karibu.automotor_automobile_service.Service;

import org.springframework.stereotype.Service;

import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeElectriqueFactory;
import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeEssenceFactory;
import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeFactory;
import com.karibu.automotor_automobile_service.Dao.AutomobileRepositoy;
import com.karibu.automotor_automobile_service.Dao.ScooterRepository;

import com.karibu.automotor_automobile_service.Entity.Automobile;
import com.karibu.automotor_automobile_service.Entity.Scooter;

@Service
 public class VehiculeImpl implements Ivehicule {
    private VehiculeFactory factoryVehiculeElectrique=new VehiculeElectriqueFactory();
    private VehiculeFactory factoryVehiculeEssence=new VehiculeEssenceFactory();
    private AutomobileRepositoy automobileRepositoy;
    private ScooterRepository scooterRepository;

    public VehiculeImpl(AutomobileRepositoy auto, ScooterRepository scooter,VehiculeElectriqueFactory vehiculeElectrique,VehiculeEssenceFactory vehiculeEssence){
        this.automobileRepositoy=auto;
        this.scooterRepository=scooter;
        this.factoryVehiculeElectrique=vehiculeElectrique;
        this.factoryVehiculeEssence=vehiculeEssence;
    }

    @Override//comment utilisant la factory sans toute fois faire de l'allongement de code inutile
    public boolean createAutoElectrique(Automobile automobile) {
        if(automobile!=null){
            Automobile autoElectrique=factoryVehiculeElectrique.getAuto();
            autoElectrique.setId(automobile.getId());
            autoElectrique.setDateFabrication(automobile.getDateFabrication());
            autoElectrique.setDescription(automobile.getDescription());
            autoElectrique.setImagePath(automobile.getImagePath());
            autoElectrique.setMarque(automobile.getMarque());
            autoElectrique.setPrix(automobile.getPrix());
            autoElectrique.setNumeroSerie(automobile.getNumeroSerie());
            
            automobileRepositoy.save(autoElectrique);
            return true;
        }else{
                return false;
        } 
       
    }

    public boolean createAutoEssence(Automobile automobile) {
        if(automobile!=null){
            Automobile autoEssence=factoryVehiculeEssence.getAuto();
            autoEssence.setId(automobile.getId());
            autoEssence.setDateFabrication(automobile.getDateFabrication());
            autoEssence.setDescription(automobile.getDescription());
            autoEssence.setImagePath(automobile.getImagePath());
            autoEssence.setMarque(automobile.getMarque());
            autoEssence.setPrix(automobile.getPrix());
            autoEssence.setNumeroSerie(automobile.getNumeroSerie());
            
            automobileRepositoy.save(autoEssence);
            return true;
        }else{

            return false;
        }
       
    }

    public boolean createScooterElectrique(Scooter scooter) {
        if(scooter!=null){
            Scooter scooterElectrique=factoryVehiculeElectrique.getScooter();
            scooterElectrique.setId(scooter.getId());
            scooterElectrique.setDateFabrication(scooter.getDateFabrication());
            scooterElectrique.setDescription(scooter.getDescription());
            scooterElectrique.setImagePath(scooter.getImagePath());
            scooterElectrique.setMarque(scooter.getMarque());
            scooterElectrique.setPrix(scooter.getPrix());
            scooterElectrique.setNumeroSerie(scooter.getNumeroSerie());
            
            scooterRepository.save(scooterElectrique);
            return true;
        }else{

            return false;
        }
       
        
    }

    public boolean createScooterEssence(Scooter scooter) {
        if(scooter!=null){
            Scooter scooterEssence=factoryVehiculeElectrique.getScooter();
            scooterEssence.setId(scooter.getId());
            scooterEssence.setDateFabrication(scooter.getDateFabrication());
            scooterEssence.setDescription(scooter.getDescription());
            scooterEssence.setImagePath(scooter.getImagePath());
            scooterEssence.setMarque(scooter.getMarque());
            scooterEssence.setPrix(scooter.getPrix());
            scooterEssence.setNumeroSerie(scooter.getNumeroSerie());
            
            scooterRepository.save(scooterEssence);
            return true;
        }else{

            return false;
        }
       
    }
    @Override
    public Automobile readAuto(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readAuto'");
    }

    @Override
    public Automobile readVehicule(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readVehicule'");
    }

    
    
}
 */