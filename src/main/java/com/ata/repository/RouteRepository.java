package com.ata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ata.entity.Route;

public interface RouteRepository extends JpaRepository<Route, Integer> {

	List<Route> findBySource(String source);

	List<Route> findByDestination(String destination);

	List<Route> findBySourceAndDestination(String source, String destination);

}
