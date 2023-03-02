package com.yahya.parkingmanageing.Entity.Model.Controller;


import com.yahya.parkingmanageing.Entity.Model.DriverLicenseIssuance;
import com.yahya.parkingmanageing.Entity.Model.License;
import com.yahya.parkingmanageing.Entity.Model.Repository.DriverRepository;
import com.yahya.parkingmanageing.Entity.Model.Service.DriverLicenseService;
import com.yahya.parkingmanageing.Entity.Model.Service.DriverLicenseServiceIssuance;
import com.yahya.parkingmanageing.Entity.Model.Service.VehicleDriverService;
import com.yahya.parkingmanageing.Entity.Model.Service.VehicleDriverServiceImpl;
import com.yahya.parkingmanageing.Entity.Model.VehicleDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Autowired
    private VehicleDriverService driverService;
    @Autowired
    private DriverLicenseService licenseService;
    @Autowired
    private DriverLicenseServiceIssuance issuancessuanceService;

    @GetMapping("/")
    public List<VehicleDriver> getAllVehicleDrivers(){
        return driverService.getVehicleDrivers();
    }
    @GetMapping("/{id}")
    public VehicleDriver getVehicleDriver(@PathVariable long id){

        return driverService.getVehicleDriverById(id);
    }
    @GetMapping("/number/{num}")
    public VehicleDriver getVehicleDriverByNumber(@PathVariable String num){

        return driverService.getVehicleDriver(num);
    }
    @PostMapping (value = "/",consumes = "application/json;charset=UTF-8")
    public void addVehicleDriver(@RequestBody VehicleDriver tmp){

         driverService.addVehicleDriver(tmp);
    }
    @DeleteMapping  (value = "/{id}")
    public void DeleteVehicleDriver(@PathVariable long id){

        driverService.deleteVehicleDriverById(id);
    }
    @DeleteMapping("/number/{num}")
    public void deleteVehicleDriverByNumber(@PathVariable String num){

         driverService.deleteVehicleDriverByEmployeeNum(num);
    }

    @PostMapping ("/number/{num}/issuances")
    public void addIssuanceToDriverByEmployeeNumber(@PathVariable String num, @RequestBody DriverLicenseIssuance Issuance){

                driverService.addIssuanceToDriverByEmployeeNumber(num,Issuance);


    }
    @PostMapping ("/number/{num}/licence")
    public void addLicenceToDriverByEmployeeNumber(@PathVariable String num, @RequestBody License license){

        driverService.addLicenseToDriverByEmployeeNumber(num,license);


    }


}
