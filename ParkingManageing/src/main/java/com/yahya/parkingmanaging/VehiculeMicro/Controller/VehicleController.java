package com.yahya.parkingmanaging.VehiculeMicro.Controller;


import com.yahya.parkingmanaging.GenericEnum.LicensesCategory;
import com.yahya.parkingmanaging.VehiculeMicro.Model.Vehicle;
import com.yahya.parkingmanaging.VehiculeMicro.Service.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
@AllArgsConstructor
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
    @GetMapping("/category/{category}")
    public List<Vehicle> getVehicleByCategory(@PathVariable LicensesCategory category){

        return vehiculeService.getVehicleByCategory(category);
    }
}
