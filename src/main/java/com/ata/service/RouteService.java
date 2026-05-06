package com.ata.service;

import java.util.List;

import com.ata.dto.RouteRequestDTO;
import com.ata.entity.Route;

public interface RouteService {

	String addRoute(RouteRequestDTO dto);

	List<Route> getAllRoutes();

	Route getRoute(Integer id);

	String deleteRoute(Integer id);

	List<Route> getBySource(String source);

	List<Route> getByDestination(String destination);

	List<Route> getBySourceAndDestination(String source, String Destination);

}
