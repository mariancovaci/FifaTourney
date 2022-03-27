package com.fifatourney.model;

import java.util.*;

public class Team {
    private int id;
    private Club club;
    private List<Player> players = new ArrayList<>();

    public Team(int id, Club club, List<Player> players) {
        this.id = id;
        this.club = club;
        this.players = players;
    }

    public Team() {

    }

    public Team(Player player1, Player player2) {
        this.players.add(player1);
        this.players.add(player2);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void insertPlayer(Player player){
        this.players.add(player);
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", club=" + club +
                ", players=" + players +
                "}\n";
    }
}
