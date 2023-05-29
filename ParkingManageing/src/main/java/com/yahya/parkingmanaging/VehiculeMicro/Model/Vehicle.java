package com.yahya.parkingmanaging.VehiculeMicro.Model;


import com.yahya.parkingmanaging.GenericEnum.LicensesCategory;
import com.yahya.parkingmanaging.GenericEnum.VehiculeEnergy;
import com.yahya.parkingmanaging.GenericEntity;
import com.yahya.parkingmanaging.MissionsMicro.Model.Mission;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Vehicle extends GenericEntity {



     @Column(unique = true)
     private String licensePlate;
     @Enumerated(EnumType.STRING)
     private VehiculeEnergy energy;
     @Enumerated(EnumType.STRING)
     private LicensesCategory category;
     //Classes
     @OneToOne
     private Registration  registration;
     @OneToOne
     private Assurance assurance;
     @OneToOne
     private VehiculeTax vehiculeTax;
     @OneToOne
      private VehiculeSafetyCheck vehiculeSafetyCheck;
     @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL, orphanRemoval = true)
     private List<Mission> Missions = new ArrayList<>();




}
