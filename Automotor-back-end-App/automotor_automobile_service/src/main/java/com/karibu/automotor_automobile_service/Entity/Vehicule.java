package com.karibu.automotor_automobile_service.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.karibu.automotor_automobile_service.Enum.VehiculeType;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity @Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="vehicule_type")

public abstract class Vehicule implements Serializable{
    
    @Id
    protected String id=UUID.randomUUID().toString();
    protected String marque;
    protected String model;
    protected String numeroSerie;
    protected String description;
    protected double prix;
    protected Date dateFabrication;
    protected List<String> imagePath;
    @Transient
    protected VehiculeType vehiculeType;
    private Long CapaciteEnergetique;
}
