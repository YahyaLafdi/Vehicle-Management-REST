package com.yahya.parkingmanaging.VehiculeMicro.Service;

import com.yahya.parkingmanaging.GenericEnum.LicensesCategory;
import com.yahya.parkingmanaging.VehiculeMicro.Model.Vehicle;

import java.util.List;

public interface VehiculeService {


    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(Long id);
    Vehicle getVehicleByPlate(String plate);
    Vehicle getVehicleByCategory(LicensesCategory licensesCategory);

    void deleteVehicleById(Long Id);
    void deleteVehicleByPlate(String Plate);
    void addVehicle(Vehicle vehicle);




}
