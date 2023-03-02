package com.yahya.parkingmanageing.Entity.Model.Service;

import com.yahya.parkingmanageing.Entity.GenericEnum.LicensesCategory;
import com.yahya.parkingmanageing.Entity.Model.DriverLicenseIssuance;
import org.springframework.stereotype.Service;


public interface DriverLicenseServiceIssuance {

    DriverLicenseIssuance getDriverLicenseIssuanceById(Long id);
    DriverLicenseIssuance getDriverLicenseIssuanceByCategory(LicensesCategory Category);
void addDriverLicenseIssuance(DriverLicenseIssuance issuance);
    void deleteDriverLicenseIssuanceById(Long id);
    void deleteDriverLicenseIssuanceByType(LicensesCategory Category);

}
