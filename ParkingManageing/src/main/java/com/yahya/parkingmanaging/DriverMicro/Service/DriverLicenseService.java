package com.yahya.parkingmanaging.DriverMicro.Service;

import com.yahya.parkingmanaging.DriverMicro.Model.License;

public interface DriverLicenseService {
    License getDriverLicenseById(Long id);
    License getDriverLicenseByIdentification(String Identification);

    void deleteDriverLicenseById(Long id);
    void deleteDriverLicenseByIdentification(String Identification);
    void addDriverLicense(License temp);




}
