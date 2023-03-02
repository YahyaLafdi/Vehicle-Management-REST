package com.yahya.parkingmanageing.DriverMicro.Model;

import com.yahya.parkingmanageing.GenericEnum.Availability;
import com.yahya.parkingmanageing.GenericEnum.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class VehicleDriver implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    private String employeeNumber;
    private String LastName;
    private String FirstName;
    private Date DateOfBirth;
    private String Cin;
    private String Skills;
    private String Certifications;
    private Availability availability;
    private Status status;




    @OneToOne(mappedBy = "vehicleDriver",fetch = FetchType.EAGER, cascade = CascadeType.ALL)

    private License driverLicense;


}
