package com.yahya.parkingmanageing.Entity.Vehicule;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class VehiculeSafetyCheck {
    private int Id;
    private String centerName;
    private Date dateOfChecking;
    private String resultRapport;

    private float Price;

    private boolean safetyCheck;



}
