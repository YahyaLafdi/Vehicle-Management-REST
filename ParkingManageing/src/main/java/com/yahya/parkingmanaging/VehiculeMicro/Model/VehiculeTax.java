package com.yahya.parkingmanaging.VehiculeMicro.Model;

import com.yahya.parkingmanaging.GenericEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class VehiculeTax extends GenericEntity {

    private float Price;
    private Date DateOfPayement;
    private int CF;//chevaux fiscal

    @OneToOne(mappedBy = "vehiculeTax")
    private Vehicle vehicle;



}
