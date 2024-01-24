package com.karibu.automotor_automobile_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeElectriqueFactory;
import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeFactory;
import com.karibu.automotor_automobile_service.Entity.AutomobileElectrique;
import com.karibu.automotor_automobile_service.Entity.AutomobileEssence;
import com.karibu.automotor_automobile_service.Service.Ivehicule;
import com.karibu.automotor_automobile_service.Service.VehiculeAutoElecImpl;
import com.karibu.automotor_automobile_service.Service.VehiculeAutoEssImpl;

@SpringBootApplication
public class AutomotorAutomobileServiceApplication implements CommandLineRunner{
	
	private Ivehicule vehiculeElecService=new VehiculeAutoElecImpl();
	private Ivehicule vehiculeEssService=new VehiculeAutoEssImpl();
	private VehiculeFactory autoFactory=new VehiculeElectriqueFactory();

	public static void main(String[] args) {
		SpringApplication.run(AutomotorAutomobileServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AutomobileElectrique autoElec=(AutomobileElectrique) autoFactory.getAuto();
		AutomobileEssence autoEss=(AutomobileEssence) autoFactory.getAuto();
		vehiculeEssService.createVehicule(autoEss);
		 vehiculeElecService.createVehicule(autoElec);
		System.out.println(vehiculeElecService.readVehicule(autoElec.getId()).toString());
		System.out.println(vehiculeEssService.readVehicule(autoEss.getId()).toString()); 

	}

}
