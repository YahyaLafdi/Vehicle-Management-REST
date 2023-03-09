package com.yahya.parkingmanaging.DriverMicro.DTO;

import com.yahya.parkingmanaging.GenericEnum.Availability;
import com.yahya.parkingmanaging.GenericEnum.Status;
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
public class VehicleDriverDTO implements Serializable {


    private String employeeNumber;
    private String LastName;
    private String FirstName;
    private Date DateOfBirth;
    private String Cin;
    private String Skills;
    private String Certifications;
    private Availability availability;
    private Status status;
    private LicenseDTO driverLicense;


}
