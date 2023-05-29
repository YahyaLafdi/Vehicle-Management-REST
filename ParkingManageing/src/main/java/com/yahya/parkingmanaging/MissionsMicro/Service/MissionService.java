package com.yahya.parkingmanaging.MissionsMicro.Service;


import com.yahya.parkingmanaging.MissionsMicro.Model.Mission;

import java.util.List;


public interface MissionService {
    Mission getMissionById(Long id);
    List<Mission> getMission();
    void deleteMissionById(Long Id);
    void addMission(Mission mission);
}
