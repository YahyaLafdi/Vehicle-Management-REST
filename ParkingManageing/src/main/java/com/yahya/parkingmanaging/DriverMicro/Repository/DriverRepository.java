package com.yahya.parkingmanaging.DriverMicro.Repository;

import com.yahya.parkingmanaging.DriverMicro.Model.VehicleDriver;

import com.yahya.parkingmanaging.GenericEnum.Availability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public interface DriverRepository extends JpaRepository<VehicleDriver, Long> {

    //@Query("SELECT p FROM VehicleDriver p WHERE p.EmployeeNumber = ?1")
    VehicleDriver findByEmployeeNumber(String employeeNumber) ;
    //@Query("SELECT p FROM VehicleDriver p WHERE p.availability = ?1")
    List<VehicleDriver> findByAvailability(Availability availability);


}
