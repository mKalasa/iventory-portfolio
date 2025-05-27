package com.example.kalasa.iventoryportfolio.repository;

import com.example.kalasa.iventoryportfolio.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
}
