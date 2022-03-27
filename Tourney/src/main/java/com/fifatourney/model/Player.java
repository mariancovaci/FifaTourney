package com.fifatourney.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "players")
public class Player implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public Player() {}

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                '}';
    }
}
