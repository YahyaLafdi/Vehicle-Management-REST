package com.yahya.parkingmanageing.VehiculeMicro.Service;

import com.yahya.parkingmanageing.VehiculeMicro.Model.Registration;
import com.yahya.parkingmanageing.VehiculeMicro.Repository.RegistrationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationServiceImpl implements RegistrationService{
    RegistrationRepository registrationRepository;
    @Override
    public Registration getRegistrationById(Long id) {
        return registrationRepository.findById(id).get();
    }

    @Override
    public List<Registration> getRegistrationAll() {
        return registrationRepository.findAll();
    }

    @Override
    public void deleteRegistrationById(Long id) {
        registrationRepository.deleteById(id);

    }

    @Override
    public void addRegistration(Registration registration) {
        registrationRepository.save(registration);
    }
}
