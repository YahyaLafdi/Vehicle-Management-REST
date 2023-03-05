package com.yahya.parkingmanageing.VehiculeMicro.Service;

import com.yahya.parkingmanageing.VehiculeMicro.Model.Assurance;
import com.yahya.parkingmanageing.VehiculeMicro.Repository.AssuranceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssuranceServiceImpl implements AssuranceService {

    AssuranceRepository assuranceRepository;
    @Override
    public Assurance getAssuranceById(Long id) {
        return assuranceRepository.findById(id).get();
    }

    @Override
    public Assurance getAssurances() {
        return assuranceRepository.findAll().get(0);
    }

    @Override
    public void deleteAssuranceById(Long id) {
        assuranceRepository.deleteById(id);

    }

    @Override
    public void addAssurance(Assurance assurance) {
        assuranceRepository.save(assurance);

    }
}
