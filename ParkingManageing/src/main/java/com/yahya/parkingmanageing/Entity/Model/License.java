package com.yahya.parkingmanageing.Entity.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class License implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String LicenseIdentification;


   @OneToOne

   @JsonIgnore
   private VehicleDriver vehicleDriver;


    @OneToMany(cascade=CascadeType.ALL ,mappedBy = "DriverLicense",fetch = FetchType.EAGER)

    private List<DriverLicenseIssuance> driverLicenseIssuanceList;

    public void addDriverLicenseIssuance(DriverLicenseIssuance driverLicenseIssuance){
        this.driverLicenseIssuanceList.add(driverLicenseIssuance);
        driverLicenseIssuance.setDriverLicense(this);
    }
    public void removeDriverLicenseIssuance(DriverLicenseIssuance driverLicenseIssuance){
        driverLicenseIssuance.setDriverLicense(null);
        this.driverLicenseIssuanceList.remove(driverLicenseIssuance);
    }
    public void removeAllDriverLicenseIssuance(){
        Iterator<DriverLicenseIssuance> iterator = this.driverLicenseIssuanceList.iterator();
        while (iterator.hasNext()) {
            DriverLicenseIssuance driverLicenseIssuance = iterator.next();
            driverLicenseIssuance.setDriverLicense(null);
            iterator.remove();
        }
    }


}
