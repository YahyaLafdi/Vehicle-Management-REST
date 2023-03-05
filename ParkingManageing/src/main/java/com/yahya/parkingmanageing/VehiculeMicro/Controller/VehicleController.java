package com.yahya.parkingmanageing.VehiculeMicro.Controller;


import com.yahya.parkingmanageing.DriverMicro.Service.VehicleDriverService;
import com.yahya.parkingmanageing.VehiculeMicro.Model.Vehicle;
import com.yahya.parkingmanageing.VehiculeMicro.Service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehiculeService vehiculeService;

    @GetMapping("/")
    public List<Vehicle> getVehicleAll(){

        return vehiculeService.getAllVehicles();
    }
    @PostMapping("/")
    public void addVehicle(@RequestBody Vehicle vehicle){
        vehiculeService.addVehicle(vehicle);
    }
    @GetMapping("/id/{id}")
    public Vehicle getVehicle(@PathVariable Long id){

        return vehiculeService.getVehicleById(id);
    }
    @GetMapping("/plates/{plate}")
    public Vehicle getVehicleByPlate(@PathVariable String plate){

        return vehiculeService.getVehicleByPlate(plate);
    }
}
