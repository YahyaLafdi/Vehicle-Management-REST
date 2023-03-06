package com.yahya.parkingmanaging.VehiculeMicro.Service;

import com.yahya.parkingmanaging.VehiculeMicro.Model.Assurance;

public interface AssuranceService {
    Assurance getAssuranceById(Long id);
    Assurance getAssurances();
    void deleteAssuranceById(Long Id);
    void addAssurance(Assurance assurance);


}
