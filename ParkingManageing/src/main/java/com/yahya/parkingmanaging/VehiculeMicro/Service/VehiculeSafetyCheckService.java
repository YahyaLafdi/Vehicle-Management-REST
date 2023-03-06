package com.yahya.parkingmanaging.VehiculeMicro.Service;

import com.yahya.parkingmanaging.VehiculeMicro.Model.VehiculeSafetyCheck;

import java.util.List;

public interface VehiculeSafetyCheckService {
    VehiculeSafetyCheck getVehiculeSafetyCheckById(Long id);
    List<VehiculeSafetyCheck> getVehiculeSafetyAll();
    void deleteVehiculeSafetyCheckById(Long Id);
    void addVehiculeSafetyCheck(VehiculeSafetyCheck vehiculeSafetyCheck);
}
