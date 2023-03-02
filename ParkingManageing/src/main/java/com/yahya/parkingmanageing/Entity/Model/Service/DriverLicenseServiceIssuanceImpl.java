package com.yahya.parkingmanageing.Entity.Model.Service;

import com.yahya.parkingmanageing.Entity.GenericEnum.LicensesCategory;
import com.yahya.parkingmanageing.Entity.Model.DriverLicenseIssuance;
import com.yahya.parkingmanageing.Entity.Model.Repository.DriverLicenseRepository;
import com.yahya.parkingmanageing.Entity.Model.Repository.DriverRepositoryIssuance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverLicenseServiceIssuanceImpl implements DriverLicenseServiceIssuance {
    @Autowired
    public DriverRepositoryIssuance driverRepositoryIssuance;
    @Override
    public DriverLicenseIssuance getDriverLicenseIssuanceById(Long id) {
        return driverRepositoryIssuance.findById(id).get();
    }

    @Override
    public DriverLicenseIssuance getDriverLicenseIssuanceByCategory(LicensesCategory Category) {
        return driverRepositoryIssuance.findDriverLicenseIssuanceByType(Category);
    }

    @Override
    public void addDriverLicenseIssuance(DriverLicenseIssuance issuance) {
        driverRepositoryIssuance.save(issuance);
    }

    @Override
    public void deleteDriverLicenseIssuanceById(Long id) {
        driverRepositoryIssuance.deleteById(id);

    }

    @Override
    public void deleteDriverLicenseIssuanceByType(LicensesCategory Category) {
        DriverLicenseIssuance tmp = getDriverLicenseIssuanceByCategory(Category);

            driverRepositoryIssuance.deleteById(tmp.getId());
    }
}
