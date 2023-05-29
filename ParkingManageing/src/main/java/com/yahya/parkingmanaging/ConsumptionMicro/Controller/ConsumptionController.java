package com.yahya.parkingmanaging.ConsumptionMicro.Controller;

import com.yahya.parkingmanaging.ConsumptionMicro.Model.Consumption;
import com.yahya.parkingmanaging.ConsumptionMicro.Model.MyConsumption;
import com.yahya.parkingmanaging.ConsumptionMicro.Service.ConsumptionService;

import com.yahya.parkingmanaging.MissionsMicro.Model.Mission;
import com.yahya.parkingmanaging.MissionsMicro.Service.MissionService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/consumptions")
@AllArgsConstructor
public class ConsumptionController {
    @Autowired
    private ConsumptionService consumptionService;

    @Autowired
    private MissionService missionService;
    private Consumption createConsumption(Long missionId , MyConsumption myConsumption) {
        Consumption consumptionEntity = new Consumption();
        Mission tempMission = missionService.getMissionById(missionId);
        consumptionEntity.setDriverName(tempMission.getVehicleDriver().getFirstName() + " " + tempMission.getVehicleDriver().getLastName());
        consumptionEntity.setVehicleBrand(tempMission.getVehicle().getEnergy().toString());
        float distanceTraveled = myConsumption.getDistanceTraveled();
        consumptionEntity.setDistanceTraveled(distanceTraveled);
        float fuelTankAfter = myConsumption.getFuelTankAfter();
        consumptionEntity.setFuelConsumed(fuelTankAfter);
        consumptionEntity.fuelConsumed(distanceTraveled, fuelTankAfter);
        consumptionEntity.setVehicleEnergy(tempMission.getVehicle().getEnergy());
        Date missionDate = myConsumption.getTravelDate();
        consumptionEntity.setTravelDate(missionDate);
        consumptionEntity.setMission(tempMission);
        return consumptionService.addConsumption(consumptionEntity);
    }
    @PostMapping("/{id}")
        public ResponseEntity<Consumption> save(@PathVariable("id") Long missionId, @RequestBody MyConsumption myConsumption) {
        Consumption savedConsumption = createConsumption(missionId, myConsumption);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedConsumption);
    }

}
