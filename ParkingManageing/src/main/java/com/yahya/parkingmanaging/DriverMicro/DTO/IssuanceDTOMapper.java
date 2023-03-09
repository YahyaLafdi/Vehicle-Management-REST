package com.yahya.parkingmanaging.DriverMicro.DTO;

import com.yahya.parkingmanaging.DriverMicro.Model.DriverLicenseIssuance;

import java.util.function.Function;

public class IssuanceDTOMapper implements Function<DriverLicenseIssuance,IssuanceDTO> {
    @Override
    public IssuanceDTO apply(DriverLicenseIssuance driverLicenseIssuance) {

        //return new IssuanceDTO(driverLicenseIssuance.getIssuanceDate(),driverLicenseIssuance.getType(),
                //driverLicenseIssuance.getDriverLicense().);


        //return null;
    }
}
