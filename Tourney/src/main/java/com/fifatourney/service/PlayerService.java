package com.fifatourney.service;

import com.fifatourney.exception.PlayerNotFoundException;
import com.fifatourney.model.Player;
import com.fifatourney.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class PlayerService {

    @Autowired
    PlayerRepo playerRepo;

    public Player addPlayer(Player player){
        return playerRepo.save(player);
    }

    public List<Player> findAllPlayers(){
        return playerRepo.findAll();
    }

    public Player updatePlayer(Player player){
        return  playerRepo.save(player);
    }

    public Player findPlayerById(Long id){
        return playerRepo.findPlayerById(id)
                .orElseThrow(()->new PlayerNotFoundException("Player with id " + id + " was not found"));
    }
}
