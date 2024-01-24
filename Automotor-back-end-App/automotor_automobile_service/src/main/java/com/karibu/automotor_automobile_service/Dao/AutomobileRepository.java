package com.karibu.automotor_automobile_service.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karibu.automotor_automobile_service.Entity.Automobile;
@Repository
public interface AutomobileRepository extends JpaRepository<Automobile,String> {
    
}
