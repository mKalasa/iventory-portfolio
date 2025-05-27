package com.example.kalasa.iventoryportfolio.repository;

import com.example.kalasa.iventoryportfolio.entity.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends JpaRepository<Venue,Long> {

}
