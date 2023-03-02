package com.yahya.parkingmanageing.DriverMicro.Service;

import com.yahya.parkingmanageing.DriverMicro.Model.License;
import com.yahya.parkingmanageing.DriverMicro.Repository.DriverLicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverLicenseServiceImpl implements DriverLicenseService{
    @Autowired
    public DriverLicenseRepository licenseRepositoryRepository;
    @Override
    public License getDriverLicenseById(Long id) {
        return licenseRepositoryRepository.findById(id).get();
    }

    @Override
    public License getDriverLicenseByIdentification(String Identification) {
        return licenseRepositoryRepository.findLicensesByLicenseIdentification(Identification);
    }

    @Override
    public void deleteDriverLicenseById(Long id) {
        licenseRepositoryRepository.deleteById(id);

    }

    @Override
    public void deleteDriverLicenseByIdentification(String Identification) {
        License l = licenseRepositoryRepository.findLicensesByLicenseIdentification(Identification);
        licenseRepositoryRepository.deleteById(l.getId());

    }

    @Override
    public void addDriverLicense(License temp) {
        licenseRepositoryRepository.save(temp);

    }
}
