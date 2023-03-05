package com.yahya.parkingmanageing.VehiculeMicro.Service;

import com.yahya.parkingmanageing.VehiculeMicro.Model.VehiculeTax;
import com.yahya.parkingmanageing.VehiculeMicro.Repository.VehiculeTaxRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class VehiculeTaxServiceImpl implements  VehiculeTaxService{
    VehiculeTaxRepository vehiculeTaxRepository;
    @Override
    public VehiculeTax getVehiculeTaxById(Long id) {
        return vehiculeTaxRepository.findById(id).get();
    }

    @Override
    public List<VehiculeTax> getVehiculeAll() {
        return vehiculeTaxRepository.findAll();
    }

    @Override
    public void deleteVehiculeTaxById(Long Id) {
    vehiculeTaxRepository.deleteById(Id);
    }

    @Override
    public void addVehiculeTax(VehiculeTax vehiculeTax) {
    vehiculeTaxRepository.save(vehiculeTax);
    }
}
