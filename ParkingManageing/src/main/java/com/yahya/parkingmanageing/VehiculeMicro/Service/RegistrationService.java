package com.yahya.parkingmanageing.VehiculeMicro.Service;


import com.yahya.parkingmanageing.VehiculeMicro.Model.Registration;

import java.util.List;

public interface RegistrationService {
    Registration getRegistrationById(Long id);
    List<Registration> getRegistrationAll();
    void deleteRegistrationById(Long Id);
    void addRegistration(Registration registration);
}
