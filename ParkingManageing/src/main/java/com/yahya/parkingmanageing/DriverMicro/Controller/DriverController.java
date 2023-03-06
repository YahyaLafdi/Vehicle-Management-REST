package com.yahya.parkingmanageing.DriverMicro.Controller;


import com.yahya.parkingmanageing.DriverMicro.Model.DriverLicenseIssuance;
import com.yahya.parkingmanageing.DriverMicro.Model.License;
import com.yahya.parkingmanageing.DriverMicro.Service.DriverLicenseService;
import com.yahya.parkingmanageing.DriverMicro.Service.DriverLicenseServiceIssuance;
import com.yahya.parkingmanageing.DriverMicro.Service.VehicleDriverService;
import com.yahya.parkingmanageing.DriverMicro.Model.VehicleDriver;
import com.yahya.parkingmanageing.GenericEnum.Availability;
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
    @GetMapping("/id/{id}")
    public VehicleDriver getVehicleDriver(@PathVariable long id){

        return driverService.getVehicleDriverById(id);
    }
    @PostMapping (value = "/",consumes = "application/json;charset=UTF-8")
    public void addVehicleDriver(@RequestBody VehicleDriver tmp){

        driverService.addVehicleDriver(tmp);
    }
    @DeleteMapping  (value = "/id/{id}")
    public void DeleteVehicleDriver(@PathVariable long id){

        driverService.deleteVehicleDriverById(id);
    }
    @GetMapping("/{num}")
    public VehicleDriver getVehicleDriverByNumber(@PathVariable String num){

        return driverService.getVehicleDriverByemp(num);
    }

    @DeleteMapping("/{num}")
    public void deleteVehicleDriverByNumber(@PathVariable String num){

         driverService.deleteVehicleDriverByEmployeeNum(num);
    }

    @PostMapping ("/{num}/issuances")
    public void addIssuanceToDriverByEmployeeNumber(@PathVariable String num, @RequestBody DriverLicenseIssuance Issuance){

                driverService.addIssuanceToDriverByEmployeeNumber(num,Issuance);


    }
    @PostMapping ("/{num}/licences")
    public void addLicenceToDriverByEmployeeNumber(@PathVariable String num, @RequestBody License license){

        driverService.addLicenseToDriverByEmployeeNumber(num,license);


    }
    @GetMapping("/available/{available}")
    public List<VehicleDriver> getVehicleDriverByNumber(@PathVariable Availability available){

        return driverService.getVehicleDriverByAvailability(available);
    }


}
