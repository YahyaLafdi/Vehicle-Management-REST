package com.yahya.parkingmanageing.VehiculeMicro.Service;

import com.yahya.parkingmanageing.VehiculeMicro.Model.VehiculeSafetyCheck;

import java.util.List;

public interface VehiculeSafetyCheckService {
    VehiculeSafetyCheck getVehiculeSafetyCheckById(Long id);
    List<VehiculeSafetyCheck> getVehiculeSafetyAll();
    void deleteVehiculeSafetyCheckById(Long Id);
    void addVehiculeSafetyCheck(VehiculeSafetyCheck vehiculeSafetyCheck);
}
