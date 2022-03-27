package com.fifatourney.Model;

import java.util.*;


public class Team {
    private String name;
    private Club club;
    private List<Player> players = new ArrayList<>();

    public Team(String name, Club club, List<Player> players) {
        this.name = name;
        this.club = club;
        this.players = players;
    }

    public Team() {

    }

    public Team(Player player1, Player player2) {
        this.players.add(player1);
        this.players.add(player2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", club=" + club +
                ", players=" + players +
                '}';
    }
}
