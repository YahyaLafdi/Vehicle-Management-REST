package com.yahya.parkingmanageing.DriverMicro.Service;

import com.yahya.parkingmanageing.DriverMicro.Model.DriverLicenseIssuance;
import com.yahya.parkingmanageing.DriverMicro.Model.License;
import com.yahya.parkingmanageing.DriverMicro.Model.VehicleDriver;
import jakarta.transaction.Transactional;

import java.util.List;


public interface VehicleDriverService {


    @Transactional
        public List<VehicleDriver> getVehicleDrivers();
    @Transactional
        public VehicleDriver getVehicleDriverById(Long id);
             // fetch by employee_NUM
             @Transactional
        public VehicleDriver getVehicleDriver(String EmployeeNumber);
    //CREATE
    @Transactional
     public void addVehicleDriver(VehicleDriver temp);
    //Update
    @Transactional
    public void updateVehicleDriver(VehicleDriver temp);
    //Delete
    @Transactional
        public void deleteVehicleDriverById(Long Id);
    @Transactional
        public void deleteVehicleDriverByEmployeeNum(String EmployeeNumber);


    @Transactional
    public void addIssuanceToDriverByEmployeeNumber(String Employee , DriverLicenseIssuance issuance);

    public void addLicenseToDriverByEmployeeNumber(String Employee , License issuance);







}
