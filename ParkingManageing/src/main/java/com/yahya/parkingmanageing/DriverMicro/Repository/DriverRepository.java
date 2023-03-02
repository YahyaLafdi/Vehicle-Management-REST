package com.yahya.parkingmanageing.DriverMicro.Repository;

import com.yahya.parkingmanageing.DriverMicro.Model.VehicleDriver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface DriverRepository extends JpaRepository<VehicleDriver, Long> {

    //@Query("SELECT p FROM VehicleDriver p WHERE p.EmployeeNumber = ?1")
    VehicleDriver findByEmployeeNumber(String employeeNumber) ;


}
