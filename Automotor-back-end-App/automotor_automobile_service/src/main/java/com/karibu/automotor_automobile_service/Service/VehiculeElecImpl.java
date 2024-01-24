package com.karibu.automotor_automobile_service.Service;


import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeElectriqueFactory;
import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeEssenceFactory;
import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeFactory;
import com.karibu.automotor_automobile_service.Dao.AutomobileRepository;
import com.karibu.automotor_automobile_service.Dao.ScooterRepository;
import com.karibu.automotor_automobile_service.Entity.Vehicule;

 /* public class VehiculeElecImpl implements Ivehicule {

    private VehiculeFactory factoryVehiculeElectrique=new VehiculeElectriqueFactory();
    private VehiculeFactory factoryVehiculeEssence=new VehiculeEssenceFactory();
    private AutomobileRepositoy automobileRepositoy;
    private ScooterRepository scooterRepository;

    public VehiculeElecImpl(AutomobileRepositoy auto, ScooterRepository scooter,VehiculeElectriqueFactory vehiculeElectrique,VehiculeEssenceFactory vehiculeEssence){
        this.automobileRepositoy=auto;
        this.scooterRepository=scooter;
        this.factoryVehiculeElectrique=vehiculeElectrique;
        this.factoryVehiculeEssence=vehiculeEssence;
    }

    public static final int AUTOMOBILE_ELECTRIQUE=1;
    public static final int AUTOMOBILE_ESSENCE=2;
    public static final int SCOOTER_ESSENCE=3;
    public static final int SCOOTER_ELECTRIQUE=4;
    @Override
    public boolean createVehicule(Vehicule vehicule) {
       switch (vehicule.getVehiculeType()) {
            case AUTOMOBILE_ELECTRIQUE:
                factoryVehiculeElectrique.getAuto();
                return true;
            case AUTOMOBILE_ESSENCE:
                factoryVehiculeEssence.getAuto();
                return true;
            case SCOOTER_ELECTRIQUE:
                factoryVehiculeElectrique.getScooter();
                return true; 
            case SCOOTER_ESSENCE:
                factoryVehiculeEssence.getScooter();
                return true;  
            default:
                return false;
                
        }

    } 

}
*/