package com.yahya.parkingmanaging.MissionsMicro.Model;

import com.yahya.parkingmanaging.DriverMicro.Model.VehicleDriver;
import com.yahya.parkingmanaging.GenericEntity;
import com.yahya.parkingmanaging.VehiculeMicro.Model.Vehicle;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Mission  extends GenericEntity {

    private String missionCode;
    private Date missionStartDate;
    private Date missionEndDate;
    private String Destination;

    @OneToOne
    private Vehicle vehicle;
    @OneToOne
    private VehicleDriver driver;
}
