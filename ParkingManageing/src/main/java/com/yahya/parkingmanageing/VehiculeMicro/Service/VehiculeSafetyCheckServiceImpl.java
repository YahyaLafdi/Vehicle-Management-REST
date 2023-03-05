package com.yahya.parkingmanageing.VehiculeMicro.Service;

import com.yahya.parkingmanageing.VehiculeMicro.Model.VehiculeSafetyCheck;
import com.yahya.parkingmanageing.VehiculeMicro.Repository.VehiculeSafetyCheckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeSafetyCheckServiceImpl implements VehiculeSafetyCheckService {

    VehiculeSafetyCheckRepository vehiculeSafetyCheckRepository;
    @Override
    public VehiculeSafetyCheck getVehiculeSafetyCheckById(Long id) {
        return vehiculeSafetyCheckRepository.findById(id).get();
    }

    @Override
    public List<VehiculeSafetyCheck> getVehiculeSafetyAll() {
        return vehiculeSafetyCheckRepository.findAll();
    }

    @Override
    public void deleteVehiculeSafetyCheckById(Long Id) {
    vehiculeSafetyCheckRepository.deleteById(Id);
    }

    @Override
    public void addVehiculeSafetyCheck(VehiculeSafetyCheck vehiculeSafetyCheck) {
        vehiculeSafetyCheckRepository.save(vehiculeSafetyCheck);
    }
}
