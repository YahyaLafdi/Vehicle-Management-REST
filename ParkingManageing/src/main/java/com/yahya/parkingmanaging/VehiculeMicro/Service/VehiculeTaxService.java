package com.yahya.parkingmanaging.VehiculeMicro.Service;
import com.yahya.parkingmanaging.VehiculeMicro.Model.VehiculeTax;

import java.util.List;

public interface VehiculeTaxService {
    VehiculeTax getVehiculeTaxById(Long id);
    List<VehiculeTax> getVehiculeAll();
    void deleteVehiculeTaxById(Long Id);
    void addVehiculeTax(VehiculeTax vehiculeTax);
}
