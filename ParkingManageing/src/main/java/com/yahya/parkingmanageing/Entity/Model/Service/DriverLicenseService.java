package com.yahya.parkingmanageing.Entity.Model.Service;

import com.yahya.parkingmanageing.Entity.Model.License;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DriverLicenseService {
    License getDriverLicenseById(Long id);
    License getDriverLicenseByIdentification(String Identification);

    void deleteDriverLicenseById(Long id);
    void deleteDriverLicenseByIdentification(String Identification);
    void addDriverLicense(License temp);




}
