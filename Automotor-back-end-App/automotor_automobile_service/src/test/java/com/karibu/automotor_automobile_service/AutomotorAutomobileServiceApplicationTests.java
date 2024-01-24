package com.karibu.automotor_automobile_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties.System;
import org.springframework.boot.test.context.SpringBootTest;

import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeElectriqueFactory;
import com.karibu.automotor_automobile_service.AbstractFactory.VehiculeFactory;
import com.karibu.automotor_automobile_service.Entity.Automobile;
import com.karibu.automotor_automobile_service.Entity.AutomobileElectrique;
import com.karibu.automotor_automobile_service.Service.Ivehicule;

@SpringBootTest
class AutomotorAutomobileServiceApplicationTests {

	@Autowired
	private Ivehicule vehiculeService;
	private VehiculeFactory autoFactory=new VehiculeElectriqueFactory();

	@Test
	void contextLoads() {
	}

	/* @Test
	public void addAutomobile(){
		Automobile auto=autoFactory.getAuto();
		vehiculeService.createAutoElectrique(auto);
	}	 */


}
