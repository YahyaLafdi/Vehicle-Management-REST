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
public class Assurance extends GenericEntity {

    private Date DateOfStart;
    private Date DateOfEnding;
    private String Company;
    private String AssuranceType;
    private float Price;
    @OneToOne(mappedBy = "assurance" )
    private Vehicle vehicle;

}
