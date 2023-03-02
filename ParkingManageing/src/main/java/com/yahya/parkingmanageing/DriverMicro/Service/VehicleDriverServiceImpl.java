package com.yahya.parkingmanageing.DriverMicro.Service;

import com.yahya.parkingmanageing.DriverMicro.Model.DriverLicenseIssuance;
import com.yahya.parkingmanageing.DriverMicro.Model.License;
import com.yahya.parkingmanageing.DriverMicro.Repository.DriverRepository;
import com.yahya.parkingmanageing.DriverMicro.Model.VehicleDriver;
import com.yahya.parkingmanageing.GenericEnum.Availability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleDriverServiceImpl implements VehicleDriverService {


@Autowired
     public DriverRepository driverRepository;
@Autowired
        public DriverLicenseService driverLicenseService;
    @Autowired
    public DriverLicenseServiceIssuance driverLicenseServiceIssuance;
    @Override

    public List<VehicleDriver> getVehicleDrivers() {

        return driverRepository.findAll();
    }

    @Override
    public VehicleDriver getVehicleDriverById(Long id) {
        return driverRepository.findById(id).get();
    }

    @Override
    public VehicleDriver getVehicleDriver(String EmployeeNumber) {

        return driverRepository.findByEmployeeNumber(EmployeeNumber);

    }

    @Override
    public void addVehicleDriver(VehicleDriver temp) {
        driverRepository.save(temp);

    }

    @Override
    public void updateVehicleDriver(VehicleDriver temp) {

    }

    @Override
    public void deleteVehicleDriverById(Long Id) {
        driverRepository.deleteById(Id);

    }

    @Override
    public void deleteVehicleDriverByEmployeeNum(String EmployeeNumber) {
        VehicleDriver tmp = driverRepository.findByEmployeeNumber(EmployeeNumber);
        deleteVehicleDriverById(tmp.getId());

    }

    @Override
    public void addIssuanceToDriverByEmployeeNumber(String employeeNumber, DriverLicenseIssuance issuance) {

        License tmp = getVehicleDriver(employeeNumber).getDriverLicense();
        issuance.setDriverLicense(tmp);
        driverLicenseServiceIssuance.addDriverLicenseIssuance(issuance);


    }

    @Override
    public void addLicenseToDriverByEmployeeNumber(String employeeNumber, License license) {
        VehicleDriver tmp = getVehicleDriver(employeeNumber);
        license.setVehicleDriver(tmp);
        driverLicenseService.addDriverLicense(license);

    }

    @Override
    public List<VehicleDriver> getVehicleDriverByAvailability(Availability availability) {
        return driverRepository.findByAvailability(availability);
    }
}
