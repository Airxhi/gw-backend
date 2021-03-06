package com.faforever.gw.model.repository;

import com.faforever.gw.model.SolarSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SolarSystemRepository extends JpaRepository<SolarSystem, UUID> {
}
