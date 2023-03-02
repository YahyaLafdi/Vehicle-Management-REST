package com.yahya.parkingmanageing.Entity.Model.Service;

import com.yahya.parkingmanageing.Entity.Model.DriverLicenseIssuance;
import com.yahya.parkingmanageing.Entity.Model.License;
import com.yahya.parkingmanageing.Entity.Model.Repository.DriverRepository;
import com.yahya.parkingmanageing.Entity.Model.VehicleDriver;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
