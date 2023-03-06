package com.yahya.parkingmanaging.DriverMicro.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yahya.parkingmanaging.GenericEnum.LicensesCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
public class DriverLicenseIssuance implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Date IssuanceDate;
    @Enumerated(EnumType.STRING)
    private LicensesCategory type;


    @ManyToOne
    @JsonIgnore
    private License DriverLicense;


}
