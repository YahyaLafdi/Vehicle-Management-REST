package com.yahya.parkingmanaging.ConsumptionMicro.Model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyConsumption implements Serializable {
    private float distanceTraveled;
    private float fuelTankAfter;//plein du réservoir en litres
    private Date travelDate;
}
