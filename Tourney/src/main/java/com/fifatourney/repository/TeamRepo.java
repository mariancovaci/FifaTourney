package com.fifatourney.repository;

import com.fifatourney.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class TeamRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
//  Club Repo

    public List<Team> getAllTeams() {
        String sql = "SELECT * FROM teams";
        return null;
    }

    private Team extractTeam(ResultSet rs,int rowNumb) throws SQLException {
        int id = rs.getInt("id");
        int club = rs.getInt("club");
        int playerOne = rs.getInt("playerOne");
        int playerTwo = rs.getInt("playerTwo");

        return null;


    }

}
