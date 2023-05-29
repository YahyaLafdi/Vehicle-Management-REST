package com.yahya.parkingmanaging.MissionsMicro.Controller;

import com.yahya.parkingmanaging.DriverMicro.Model.VehicleDriver;
import com.yahya.parkingmanaging.DriverMicro.Service.VehicleDriverService;
import com.yahya.parkingmanaging.MissionsMicro.Model.Mission;
import com.yahya.parkingmanaging.MissionsMicro.Service.MissionService;
import com.yahya.parkingmanaging.VehiculeMicro.Model.Vehicle;
import com.yahya.parkingmanaging.VehiculeMicro.Service.VehiculeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missions")
@AllArgsConstructor
public class MissionController {
    @Autowired
    private  MissionService missionService;
    @Autowired
    private  VehicleDriverService vehicleDriverService;
    @Autowired
    private final VehiculeService vehicleService;
    @PostMapping("/")
    public void addMission(@RequestBody Mission mission, @RequestParam Long vehicleId, @RequestParam Long driverId){

        VehicleDriver tempDriver = vehicleDriverService.getVehicleDriverById(driverId);
        Vehicle tempVehicle = vehicleService.getVehicleById(vehicleId);
        mission.setVehicle(tempVehicle);
        mission.setVehicleDriver(tempDriver);
        missionService.addMission(mission);
    }
    @GetMapping ("/")
    public List<Mission> getMissions(){

        return missionService.getMission();
    }
    @GetMapping ("/{id}")
    public Mission getMission(@PathVariable Long id){

        return missionService.getMissionById(id);
    }
}
