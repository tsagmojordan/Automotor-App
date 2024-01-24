package com.karibu.automotor_automobile_service.Entity;

import java.io.Serializable;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "automobile")
public abstract class Automobile extends Vehicule  {
  
    
}
