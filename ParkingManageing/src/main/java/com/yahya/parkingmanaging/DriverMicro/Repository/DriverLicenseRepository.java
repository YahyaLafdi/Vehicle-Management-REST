package com.yahya.parkingmanaging.DriverMicro.Repository;

import com.yahya.parkingmanaging.DriverMicro.Model.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverLicenseRepository extends JpaRepository<License, Long> {

    @Query("SELECT p FROM License p WHERE p.LicenseIdentification = ?1")
    License findLicensesByLicenseIdentification(String LicenseIdentification);
}
