package com.yahya.parkingmanaging.DriverMicro.Service;

import com.yahya.parkingmanaging.DriverMicro.Controller.DriverController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest(controllers = DriverController.class)
@AutoConfigureMockMvc(addFilters = false)

public class DriverControllerTest {
@MockBean
    VehicleDriverService vehicleDriverService;
@Autowired
private MockMvc mockMvc;

@Test
@DisplayName("TEST get all ")
public  void showAllDrivers() throws Exception {
    //VehicleDriver vehicleDriver = new VehicleDriver(1,"SS","SS","SS",);
        mockMvc.perform(MockMvcRequestBuilders.get("/drivers/")).andExpect(MockMvcResultMatchers.status().is(200));
    }

}