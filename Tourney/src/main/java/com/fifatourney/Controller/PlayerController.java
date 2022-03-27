package com.fifatourney.Controller;

import com.fifatourney.model.Player;
import com.fifatourney.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private final PlayerService playerService;


    public PlayerController(PlayerService playerService) {this.playerService = playerService;}

    @GetMapping("/all")
    public ResponseEntity<List<Player>> getAllPlayers(){
        List<Player> players = playerService.findAllPlayers();
        return new ResponseEntity<>(players, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Player> getPlayerById (@PathVariable("id") Long id){
        Player player = playerService.findPlayerById(id);
        return new ResponseEntity<>(player,HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player){
        Player newPlayer = playerService.addPlayer(player);
        return new ResponseEntity<>(player,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Player> updatePlayer(@RequestBody Player player){
        Player updatedPlayer = playerService.updatePlayer(player);
        return new ResponseEntity<>(player,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePlayer(@PathVariable("id") Long id){
        playerService.deletePlayer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
