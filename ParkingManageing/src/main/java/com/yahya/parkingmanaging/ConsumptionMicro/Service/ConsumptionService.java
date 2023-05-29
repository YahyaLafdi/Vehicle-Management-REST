package com.yahya.parkingmanaging.ConsumptionMicro.Service;


import com.yahya.parkingmanaging.ConsumptionMicro.Model.Consumption;

import java.util.List;

public interface ConsumptionService {
    Consumption getConsumptionById(Long id);
    List<Consumption> getConsumptions();
    void deleteConsumptionById(Long Id);
    Consumption addConsumption(Consumption consumption);
}
