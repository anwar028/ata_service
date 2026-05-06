package com.ata.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ata.dto.RouteRequestDTO;
import com.ata.entity.Route;
import com.ata.repository.RouteRepository;
import com.ata.service.RouteService;

@Service
public class RouteServiceImpl implements RouteService {

	private RouteRepository routerepo;

	public RouteServiceImpl(RouteRepository routerepo) {
		this.routerepo = routerepo;
	}

	@Override
	public String addRoute(RouteRequestDTO dto) {

		Route route = new Route();

		route.setDestination(dto.getDestination());
		route.setDistanceInKm(dto.getDistanceInKm());
		route.setEstimatedTime(dto.getEstimatedTime());
		route.setSource(dto.getSource());

		routerepo.save(route);

		return "Route added successfully";
	}

	@Override
	public List<Route> getAllRoutes() {

		return routerepo.findAll();
	}

	@Override
	public Route getRoute(Integer id) {

		return routerepo.findById(id).orElseThrow(() -> new RuntimeException("Route not found"));

	}

	@Override
	public String deleteRoute(Integer id) {

		routerepo.deleteById(id);
		return "Route deleted successfully";
	}

	@Override
	public List<Route> getBySource(String source) {
		return routerepo.findBySource(source);
	}

	@Override
	public List<Route> getByDestination(String destination) {

		return routerepo.findByDestination(destination);
	}

	@Override
	public List<Route> getBySourceAndDestination(String source, String Destination) {
		return routerepo.findBySourceAndDestination(source, Destination);

	}

}
