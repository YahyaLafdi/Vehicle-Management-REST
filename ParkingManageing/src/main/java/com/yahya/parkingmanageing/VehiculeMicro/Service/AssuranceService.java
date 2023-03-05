package com.yahya.parkingmanageing.VehiculeMicro.Service;

import com.yahya.parkingmanageing.VehiculeMicro.Model.Assurance;

public interface AssuranceService {
    Assurance getAssuranceById(Long id);
    Assurance getAssurances();
    void deleteAssuranceById(Long Id);
    void addAssurance(Assurance assurance);


}
