package com.yahya.parkingmanaging.MissionsMicro.Service;

import com.yahya.parkingmanaging.MissionsMicro.Model.Mission;
import com.yahya.parkingmanaging.MissionsMicro.Repository.MissionRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MissionServiceImpl implements MissionService{


@Autowired
public MissionRepository missionRepository;
    @Override
    public Mission getMissionById(Long id) {
        return missionRepository.findById(id).get();
    }

    @Override
    public List<Mission> getMission() {
        return missionRepository.findAll();
    }

    @Override
    public void deleteMissionById(Long id) {
        missionRepository.deleteById(id);
    }

    @Override
    public void addMission(Mission mission) {
        missionRepository.save(mission);
    }
}
