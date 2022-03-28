package com.fifatourney.repository;

import com.fifatourney.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepo extends JpaRepository<Club, Long> {

    void deleteById(Long id);

    Optional<Club> findClubById(Long id);

}
