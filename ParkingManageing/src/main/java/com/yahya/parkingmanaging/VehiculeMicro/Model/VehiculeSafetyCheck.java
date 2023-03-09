package com.yahya.parkingmanaging.VehiculeMicro.Model;


import com.yahya.parkingmanaging.GenericEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VehiculeSafetyCheck extends GenericEntity {

    private String centerName;
    private Date dateOfChecking;
    private String resultRapport;

    private float Price;

    private boolean safetyCheck;
    @OneToOne(mappedBy = "vehiculeSafetyCheck" )
    private Vehicle vehicle;




}
