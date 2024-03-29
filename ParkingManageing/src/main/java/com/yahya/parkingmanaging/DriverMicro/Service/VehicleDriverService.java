package com.yahya.parkingmanaging.DriverMicro.Service;

import com.yahya.parkingmanaging.DriverMicro.Model.DriverLicenseIssuance;
import com.yahya.parkingmanaging.DriverMicro.Model.License;
import com.yahya.parkingmanaging.DriverMicro.Model.VehicleDriver;
import com.yahya.parkingmanaging.GenericEnum.Availability;
import jakarta.transaction.Transactional;

import java.util.List;


public interface VehicleDriverService {


    @Transactional
        public List<VehicleDriver> getVehicleDrivers();
    @Transactional
        public VehicleDriver getVehicleDriverById(Long id);
             // fetch by employee_NUM
             @Transactional
        public VehicleDriver getVehicleDriverByemp(String EmployeeNumber);
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
    List<VehicleDriver> getVehicleDriverByAvailability(Availability availability);







}
