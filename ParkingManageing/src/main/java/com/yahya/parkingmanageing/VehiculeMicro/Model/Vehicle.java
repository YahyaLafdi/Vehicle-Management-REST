package com.yahya.parkingmanageing.VehiculeMicro.Model;


import com.yahya.parkingmanageing.GenericEnum.VehiculeEnergy;
import com.yahya.parkingmanageing.VehiculeMicro.GenericEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Vehicle extends GenericEntity {



     @Column(unique = true)
     private String licensePlate;
     private VehiculeEnergy energy;

     //Classes
     @OneToOne
     private Registration  registration;
     @OneToOne
     private Assurance assurance;
     @OneToOne
     private VehiculeTax vehiculeTax;
     @OneToOne
      private VehiculeSafetyCheck vehiculeSafetyCheck;



}
