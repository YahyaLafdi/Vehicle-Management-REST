package com.yahya.parkingmanaging.DriverMicro.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class LicenseDTO implements Serializable {
    private String LicenseIdentification;



   private VehicleDriverDTO vehicleDriverDTO;



    private List<DriverLicenseIssuanceDTO> driverLicenseIssuanceList;




}
