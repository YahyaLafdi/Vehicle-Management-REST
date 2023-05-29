package com.yahya.parkingmanaging.MissionsMicro.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yahya.parkingmanaging.ConsumptionMicro.Model.Consumption;
import com.yahya.parkingmanaging.DriverMicro.Model.VehicleDriver;
import com.yahya.parkingmanaging.GenericEntity;
import com.yahya.parkingmanaging.VehiculeMicro.Model.Vehicle;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Mission  extends GenericEntity {

    private String missionCode;
    private Date missionStartDate;
    private Date missionEndDate;
    private String Destination;

    @ManyToOne
    @JsonIgnore
    private Vehicle vehicle;

    @ManyToOne
    @JsonIgnore
    private VehicleDriver vehicleDriver;
    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Consumption> consumptions;
}
