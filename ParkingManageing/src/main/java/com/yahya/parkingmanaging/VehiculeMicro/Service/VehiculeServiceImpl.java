package com.yahya.parkingmanaging.VehiculeMicro.Service;

import com.yahya.parkingmanaging.GenericEnum.LicensesCategory;
import com.yahya.parkingmanaging.VehiculeMicro.Model.Vehicle;
import com.yahya.parkingmanaging.VehiculeMicro.Repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
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
    public List<Vehicle> getVehicleByCategory(LicensesCategory licensesCategory) {
        return vehicleRepository.findVehicleByCategory(licensesCategory);
    }

    @Override
    public void deleteVehicleById(Long Id) {
        vehicleRepository.deleteById(Id);

    }

    @Override
    public void deleteVehicleByPlate(String Plate) {

    }


    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);

    }

    @Override
    public List<Vehicle> getAvailableVehicles() {
        List<Vehicle> vehicles = vehicleRepository.findAll();
        Date currentDate = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());
        return vehicles.stream()
                .filter(vehicle ->
                        vehicle.getMissions().stream()
                                .allMatch(travel ->
                                        travel.getMissionEndDate().before(currentDate) || travel.getMissionStartDate().after(currentDate)
                                )
                )
                .collect(Collectors.toList());

    }

    @Override
    public boolean isVehicleAvailable(java.sql.Date start, java.sql.Date endDate, Vehicle vehicle) {
        return vehicle.getMissions().stream().anyMatch(mission -> mission.getMissionEndDate().after(start) && mission.getMissionStartDate().before(endDate));
    }


}
