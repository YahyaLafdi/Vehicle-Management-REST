package com.yahya.parkingmanaging.DriverMicro.Service;

import com.yahya.parkingmanaging.GenericEnum.LicensesCategory;
import com.yahya.parkingmanaging.DriverMicro.Model.DriverLicenseIssuance;


public interface DriverLicenseServiceIssuance {

    DriverLicenseIssuance getDriverLicenseIssuanceById(Long id);
    DriverLicenseIssuance getDriverLicenseIssuanceByCategory(LicensesCategory Category);
void addDriverLicenseIssuance(DriverLicenseIssuance issuance);
    void deleteDriverLicenseIssuanceById(Long id);
    void deleteDriverLicenseIssuanceByType(LicensesCategory Category);

}
