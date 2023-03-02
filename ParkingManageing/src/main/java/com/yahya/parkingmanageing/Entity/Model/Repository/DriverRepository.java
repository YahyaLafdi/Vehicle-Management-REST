package com.yahya.parkingmanageing.Entity.Model.Repository;

import com.yahya.parkingmanageing.Entity.GenericEnum.Availability;
import com.yahya.parkingmanageing.Entity.Model.VehicleDriver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public interface DriverRepository extends JpaRepository<VehicleDriver, Long> {

    //@Query("SELECT p FROM VehicleDriver p WHERE p.EmployeeNumber = ?1")
    VehicleDriver findByEmployeeNumber(String employeeNumber) ;


}
