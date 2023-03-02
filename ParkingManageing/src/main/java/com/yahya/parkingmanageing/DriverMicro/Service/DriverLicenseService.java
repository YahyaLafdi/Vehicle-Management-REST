package com.yahya.parkingmanageing.DriverMicro.Service;

import com.yahya.parkingmanageing.DriverMicro.Model.License;

public interface DriverLicenseService {
    License getDriverLicenseById(Long id);
    License getDriverLicenseByIdentification(String Identification);

    void deleteDriverLicenseById(Long id);
    void deleteDriverLicenseByIdentification(String Identification);
    void addDriverLicense(License temp);




}
