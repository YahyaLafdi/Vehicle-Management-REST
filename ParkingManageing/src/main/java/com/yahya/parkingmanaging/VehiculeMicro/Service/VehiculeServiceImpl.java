package com.yahya.parkingmanaging.VehiculeMicro.Service;

import com.yahya.parkingmanaging.GenericEnum.LicensesCategory;
import com.yahya.parkingmanaging.VehiculeMicro.Model.Vehicle;
import com.yahya.parkingmanaging.VehiculeMicro.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeServiceImpl implements VehiculeService{
    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id).get();
    }

    @Override
    public Vehicle getVehicleByPlate(String plate) {
        return vehicleRepository.findByLicensePlate(plate);
    }

    @Override
    public Vehicle getVehicleByCategory(LicensesCategory licensesCategory) {
        return null;
    }

    @Override
    public void deleteVehicleById(Long Id) {

    }

    @Override
    public void deleteVehicleByPlate(String Plate) {


    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);

    }
}
