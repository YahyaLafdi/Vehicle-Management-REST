package com.yahya.parkingmanageing.VehiculeMicro.Service;

import com.yahya.parkingmanageing.GenericEnum.LicensesCategory;
import com.yahya.parkingmanageing.VehiculeMicro.Model.Assurance;
import com.yahya.parkingmanageing.VehiculeMicro.Model.Vehicle;
import com.yahya.parkingmanageing.VehiculeMicro.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;

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
