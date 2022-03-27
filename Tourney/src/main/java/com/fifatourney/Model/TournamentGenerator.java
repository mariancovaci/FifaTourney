package com.fifatourney.Model;
import java.util.*;

public class TournamentGenerator {
    private  List<Player> playerList;
    private List<Club> clubList;
    private List<Team> teamList;

    public List<Club> getClubList() {
        return clubList;
    }

    public void setClubList(List<Club> clubList) {
        this.clubList = clubList;
    }

    public TournamentGenerator(List<Player> playerList) {
        this.playerList = playerList;
        createTeams();
    }

    private void createTeams(){
        List<Team> teams = new ArrayList<>();
        List<Player> playerListWork = playerList;

        while (playerListWork.size() > 1){
            Player player = playerListWork.get(0);
            System.out.println(((int)(Math.random() * playerListWork.size())));
            playerListWork.remove(player);
            Player randomPlayer = playerListWork.get(((int)(Math.random() * playerListWork.size())));
            if (randomPlayer != null){
                teams.add(new Team(player,randomPlayer));
            }
            playerListWork.remove(randomPlayer);
        }
        //Treat uneven team-mates
        teams.add(new Team(playerListWork.get(0),new Player("Unknown")));
        this.teamList = teams;
    }

    public void assignClubToTeams(){
        List<Club> clubListWork = clubList;
        for (Team team : teamList){
            Club club = clubListWork.get((int) Math.random() * clubList.size());
            team.setClub(club);
            clubListWork.remove(club);
        }
    }




}
