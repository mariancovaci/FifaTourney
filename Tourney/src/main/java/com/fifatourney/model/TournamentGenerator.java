package com.fifatourney.model;
import java.util.*;

public class TournamentGenerator {
    private  List<Player> playerList;
    private List<Club> clubList;
    private List<Team> teamList;
    private List<Match> matchList = new ArrayList<>();
    public List<Club> getClubList() {
        return clubList;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setClubList(List<Club> clubList) {
        this.clubList = clubList;
        assignClubToTeams();
    }

    public TournamentGenerator(List<Player> playerList) {
        this.playerList = playerList;
        createTeams();
    }

    private void createTeams(){
        List<Team> teams = new ArrayList<>();
        List<Player> playerListWork = new ArrayList<>(playerList);

        while (playerListWork.size() > 1){
            Player player = playerListWork.get(0);
            System.out.println(((int)(Math.random() * playerListWork.size())));
            playerListWork.remove(player);
            Player randomPlayer = playerListWork.get(((int)(Math.random() * playerListWork.size())));
            teams.add(new Team(player,randomPlayer));
            playerListWork.remove(randomPlayer);
        }
        //Treat uneven team-mates

        if (playerListWork.size() != 0) teams.add(new Team(playerListWork.get(0),new Player("Random")));
        System.out.println(teams);
        this.teamList = teams;
    }

    public void assignClubToTeams(){
        List<Club> clubListWork = new ArrayList<>(clubList);
        for (Team team : teamList){
            Club club = clubListWork.get((int) (Math.random() * clubListWork.size()));
            team.setClub(club);
            clubListWork.remove(club);
        }
    }

    public List<Match> getMatchList() {
        return matchList;
    }

    public void createTournament(){
        for (Team team : teamList){
            matchList.addAll(createHome(team,teamList));
        }
    }

    List<Match> createHome(Team team,List<Team> teams){
        List<Match> matchList = new ArrayList<>();
        List<Team> teamList = new ArrayList<>(teams);
        teamList.remove(team);
        for (Team awayTeam : teamList){
            matchList.add(new Match(team,awayTeam));
        }
        return matchList;
    }

}
