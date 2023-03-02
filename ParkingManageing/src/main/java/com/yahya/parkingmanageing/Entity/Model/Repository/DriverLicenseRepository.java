package com.yahya.parkingmanageing.Entity.Model.Repository;

import com.yahya.parkingmanageing.Entity.Model.License;
import com.yahya.parkingmanageing.Entity.Model.VehicleDriver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverLicenseRepository extends JpaRepository<License, Long> {

    @Query("SELECT p FROM License p WHERE p.LicenseIdentification = ?1")
    License findLicensesByLicenseIdentification(String LicenseIdentification);
}
