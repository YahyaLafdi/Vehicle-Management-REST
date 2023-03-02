package com.yahya.parkingmanageing.DriverMicro.Service;

import com.yahya.parkingmanageing.GenericEnum.LicensesCategory;
import com.yahya.parkingmanageing.DriverMicro.Model.DriverLicenseIssuance;


public interface DriverLicenseServiceIssuance {

    DriverLicenseIssuance getDriverLicenseIssuanceById(Long id);
    DriverLicenseIssuance getDriverLicenseIssuanceByCategory(LicensesCategory Category);
void addDriverLicenseIssuance(DriverLicenseIssuance issuance);
    void deleteDriverLicenseIssuanceById(Long id);
    void deleteDriverLicenseIssuanceByType(LicensesCategory Category);

}
