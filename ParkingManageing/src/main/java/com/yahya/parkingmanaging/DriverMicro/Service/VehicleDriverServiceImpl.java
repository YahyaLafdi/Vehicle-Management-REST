package com.yahya.parkingmanaging.DriverMicro.Service;

import com.yahya.parkingmanaging.DriverMicro.Model.DriverLicenseIssuance;
import com.yahya.parkingmanaging.DriverMicro.Model.License;
import com.yahya.parkingmanaging.DriverMicro.Repository.DriverRepository;
import com.yahya.parkingmanaging.DriverMicro.Model.VehicleDriver;
import com.yahya.parkingmanaging.GenericEnum.Availability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

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
    public VehicleDriver getVehicleDriverByemp(String EmployeeNumber) {

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

        License tmp = getVehicleDriverByemp(employeeNumber).getDriverLicense();
        issuance.setDriverLicense(tmp);
        driverLicenseServiceIssuance.addDriverLicenseIssuance(issuance);


    }

    @Override
    public void addLicenseToDriverByEmployeeNumber(String employeeNumber, License license) {
        VehicleDriver tmp = getVehicleDriverByemp(employeeNumber);
        license.setVehicleDriver(tmp);
        driverLicenseService.addDriverLicense(license);

    }

    @Override
    public List<VehicleDriver> getVehicleDriverByAvailability(Availability availability) {
        return driverRepository.findByAvailability(availability);
    }

    @Override
    public List<VehicleDriver> getAvailableDrivers() {
        List<VehicleDriver> allDrivers = driverRepository.findAll();
        java.util.Date currentDate = java.util.Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
        return allDrivers.stream()
                .filter(driver ->
                        driver.getMissions().stream()
                                .allMatch(mission ->
                                        mission.getMissionEndDate().before(currentDate) || mission.getMissionStartDate().after(currentDate)
                                )
                )
                .collect(Collectors.toList());
    }

    @Override
    public boolean isVehicleDriverAvailable(Date start, Date endDate, VehicleDriver vehicleDriver) {
        return vehicleDriver.getMissions().stream().anyMatch(mission -> mission.getMissionEndDate().after(start) && mission.getMissionStartDate().before(endDate));

    }
}
