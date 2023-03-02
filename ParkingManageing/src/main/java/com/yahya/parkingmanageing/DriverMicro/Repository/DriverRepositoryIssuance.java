package com.yahya.parkingmanageing.DriverMicro.Repository;

import com.yahya.parkingmanageing.GenericEnum.LicensesCategory;
import com.yahya.parkingmanageing.DriverMicro.Model.DriverLicenseIssuance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepositoryIssuance extends JpaRepository<DriverLicenseIssuance, Long> {
    @Query("SELECT p FROM DriverLicenseIssuance p WHERE p.type = ?1")
    DriverLicenseIssuance findDriverLicenseIssuanceByType(LicensesCategory Category);
}
