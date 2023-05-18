package com.yahya.parkingmanaging.DriverMicro.DTO;

import com.yahya.parkingmanaging.GenericEnum.LicensesCategory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class IssuanceDTO implements Serializable {

    private Date IssuanceDate;

    private LicensesCategory type;

    private LicenseDTO DriverLicense;


}
