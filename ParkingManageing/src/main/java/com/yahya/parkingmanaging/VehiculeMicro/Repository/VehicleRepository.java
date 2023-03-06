package com.yahya.parkingmanaging.VehiculeMicro.Repository;

import com.yahya.parkingmanaging.GenericRepository;
import com.yahya.parkingmanaging.VehiculeMicro.Model.Vehicle;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends GenericRepository<Vehicle> {
    Vehicle findByLicensePlate(String licensePlate);
}
