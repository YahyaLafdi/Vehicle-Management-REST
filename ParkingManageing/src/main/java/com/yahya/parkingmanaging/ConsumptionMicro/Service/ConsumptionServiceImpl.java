package com.yahya.parkingmanaging.ConsumptionMicro.Service;

import com.yahya.parkingmanaging.ConsumptionMicro.Model.Consumption;
import com.yahya.parkingmanaging.ConsumptionMicro.Repository.ConsumptionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ConsumptionServiceImpl implements ConsumptionService {


@Autowired
public ConsumptionRepository consumptionRepository;

    @Override
    public Consumption getConsumptionById(Long id) {
        return consumptionRepository.findById(id).get();
    }

    @Override
    public List<Consumption> getConsumptions() {
        return consumptionRepository.findAll();
    }

    @Override
    public void deleteConsumptionById(Long Id) {
         consumptionRepository.deleteById(Id);
    }

    @Override
    public Consumption addConsumption(Consumption consumption) {
         return consumptionRepository.save(consumption);
    }
}
