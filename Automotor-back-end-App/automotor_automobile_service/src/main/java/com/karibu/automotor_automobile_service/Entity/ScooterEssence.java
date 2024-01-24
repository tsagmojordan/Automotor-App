package com.karibu.automotor_automobile_service.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
import com.karibu.automotor_automobile_service.Enum.CapaciteEnergetique;
@Entity @Getter @Setter
public class ScooterEssence extends Scooter{
    @Enumerated(EnumType.STRING)
    private CapaciteEnergetique mesureCapaciteEnergetique;
}
