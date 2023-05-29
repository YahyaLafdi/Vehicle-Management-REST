package com.yahya.parkingmanaging.VehiculeMicro.Repository;

import com.yahya.parkingmanaging.GenericEnum.LicensesCategory;
import com.yahya.parkingmanaging.GenericRepository;
import com.yahya.parkingmanaging.VehiculeMicro.Model.Vehicle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends GenericRepository<Vehicle> {
    Vehicle findByLicensePlate(String licensePlate);

    List<Vehicle> findVehicleByCategory(LicensesCategory licensesCategory);
}
