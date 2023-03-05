package com.yahya.parkingmanageing.VehiculeMicro.Repository;

import com.yahya.parkingmanageing.VehiculeMicro.Model.Vehicle;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends GenericRepository<Vehicle>{
    Vehicle findByLicensePlate(String licensePlate);
}
