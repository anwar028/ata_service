package com.ata.repository;

import com.ata.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
    Optional<Route> findBySourceAndDestination(String source, String destination);

    List<Route> findByStatus(String status);
}
