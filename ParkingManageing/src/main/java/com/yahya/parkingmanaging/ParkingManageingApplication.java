package com.yahya.parkingmanaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })

public class ParkingManageingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParkingManageingApplication.class, args);
    }

}
