package com.fifatourney;

import com.fifatourney.Model.Club;
import com.fifatourney.Model.Player;
import com.fifatourney.Model.Tournament;
import com.fifatourney.Model.TournamentGenerator;

import java.util.*;
public class Main {
    public static void main(String[] args) {



    List<Player> playerList = Arrays.asList(new Player("Andrei"),
                                            new Player("Alin"),
                                            new Player("Ion"),
                                            new Player("Vlad"),
                                            new Player("Marian"),
                                            new Player("Sergiu"));

    List<Club> clubList = Arrays.asList(new Club("Barcelona"),
                                        new Club("Real Madrid"),
                                        new Club("Atletico Madrid"),
                                        new Club("Liverpool"),
                                        new Club("Manchester City"),
                                        new Club("Manchester United"),
                                        new Club("CFR Cluj"));



    TournamentGenerator tournament = new TournamentGenerator(playerList);
    tournament.setClubList(clubList);




}
}
