package com.karibu.automotor_automobile_service.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karibu.automotor_automobile_service.Entity.AutomobileElectrique;
@Repository
public interface VehiculeRepository extends JpaRepository<AutomobileElectrique,String>{
    
}
