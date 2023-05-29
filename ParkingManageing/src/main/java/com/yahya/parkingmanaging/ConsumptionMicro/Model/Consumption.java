package com.yahya.parkingmanaging.ConsumptionMicro.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yahya.parkingmanaging.DriverMicro.Model.VehicleDriver;
import com.yahya.parkingmanaging.GenericEntity;
import com.yahya.parkingmanaging.GenericEnum.VehiculeEnergy;
import com.yahya.parkingmanaging.MissionsMicro.Model.Mission;
import com.yahya.parkingmanaging.VehiculeMicro.Model.Vehicle;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Consumption  extends GenericEntity {

    private String driverName;
    private String vehicleBrand;
    @Temporal(TemporalType.DATE)
    private Date travelDate;
    private VehiculeEnergy vehicleEnergy;
    private float distanceTraveled;//distance parcourus
    private float fuelFullTank;//plein du réservoir en litres
    private float fuelTankAfter;//réservoir en litres apres un voyage
    private float fuelConsumed;//Consomation Litre par Kilo metres
    @ManyToOne
    @JoinColumn(name = "MISSION_ID")
    private Mission mission;

    public void fuelConsumed(float nbrKM, float tankFull) {
        this.fuelConsumed = (this.fuelFullTank-tankFull / nbrKM);
    }


}
