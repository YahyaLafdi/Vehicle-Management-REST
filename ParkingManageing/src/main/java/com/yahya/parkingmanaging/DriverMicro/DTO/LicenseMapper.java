package com.yahya.parkingmanaging.DriverMicro.DTO;


import com.yahya.parkingmanaging.DriverMicro.Model.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LicenseMapper {

        LicenseDTO toDto(License license);
        License toLicense(LicenseDTO licenseDTO);
        VehicleDriverDTO toDto(VehicleDriver vehicleDriver);
        DriverLicenseIssuanceDTO toDto(DriverLicenseIssuance driverLicenseIssuance);

}
