package com.fifatourney.Controller;

import com.fifatourney.model.Club;
import com.fifatourney.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/clubs")
public class ClubController {

    @Autowired
    private ClubService clubService;

    @GetMapping("/all")
    public ResponseEntity<List<Club>> getAllClubs(){
        List<Club> clubs = clubService.findAllClubs();
        return new ResponseEntity<>(clubs, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Club> getClubById(@PathVariable("id") Long id){
        Club club = clubService.findClubById(id);
        return new ResponseEntity<>(club,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Club> addClub(@RequestBody Club club){
        Club newClub = clubService.addClub(club);
        return new ResponseEntity<>(newClub,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Club> updateClub(@RequestBody Club club){
        Club updatedClub = clubService.updateClub(club);
        return new ResponseEntity<>(updatedClub,HttpStatus.OK);
    }
}
