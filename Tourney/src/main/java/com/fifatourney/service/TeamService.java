package com.fifatourney.service;

import com.fifatourney.model.Team;
import com.fifatourney.repository.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    TeamRepo teamRepo;


    public List<Team> getAllTeams() {
        return teamRepo.getAllTeams();
    }
}
