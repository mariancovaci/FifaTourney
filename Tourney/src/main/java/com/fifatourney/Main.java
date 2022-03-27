package com.fifatourney;

import com.fifatourney.model.Club;
import com.fifatourney.model.Player;
import com.fifatourney.model.TournamentGenerator;

import java.util.*;
public class Main {
    public static void main(String[] args) {



    List<Player> playerList = Arrays.asList(new Player("Andrei"),
                                            new Player("Alin"),
                                            new Player("Ion"),
                                            new Player("Vlad"),
                                            new Player("Marian"));
//                                            new Player("Sergiu"));

    List<Club> clubList = Arrays.asList(new Club("Barcelona"),
                                        new Club("Real Madrid"),
                                        new Club("Atletico Madrid"),
                                        new Club("Liverpool"),
                                        new Club("Manchester City"),
                                        new Club("Manchester United"),
                                        new Club("CFR Cluj"));



    TournamentGenerator tournament = new TournamentGenerator(playerList);
    tournament.setClubList(clubList);
        System.out.println(tournament.getTeamList());


}
}
