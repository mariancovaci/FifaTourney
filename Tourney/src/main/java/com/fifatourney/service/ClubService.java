package com.fifatourney.service;

import com.fifatourney.exception.ItemNotFoundException;
import com.fifatourney.model.Club;
import com.fifatourney.repository.ClubRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ClubService {

    @Autowired
    ClubRepo clubRepo;

    public Club addClub(Club club){return clubRepo.save(club);}

    public List<Club> findAllClubs(){
        return clubRepo.findAll();
    }

    public Club updateClub(Club club){ return clubRepo.save(club);}

    public Club findClubById(Long id){
        return clubRepo.findClubById(id)
                .orElseThrow(()-> new ItemNotFoundException("Club with id " + id + " was not found"));
    }

    public void deleteClub(Long id){
        clubRepo.deleteById(id);
    }

}
