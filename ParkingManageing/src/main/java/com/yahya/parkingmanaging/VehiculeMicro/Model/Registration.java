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
public class Registration extends GenericEntity {


private Date DateOfUsing;
    private Date DateOfValidity;
    private String Brand;
    private String Owner;
    @OneToOne(mappedBy = "registration" )
    private Vehicle vehicle;

}
