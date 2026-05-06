package com.ata.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ata.dto.RouteRequestDTO;
import com.ata.entity.Route;
import com.ata.service.RouteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/route")
public class RouteController {

	private RouteService service;

	public RouteController(RouteService service) {

		this.service = service;
	}

	@PostMapping("/add")
	public ResponseEntity<String> addRoute(@Valid @RequestBody RouteRequestDTO dto) {

		String msg = service.addRoute(dto);

		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@GetMapping("/all")
	public ResponseEntity<List<Route>> getAllRoutes() {

		List<Route> routes = service.getAllRoutes();

		return new ResponseEntity<>(routes, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Route> getRoute(@PathVariable Integer id) {

		Route route = service.getRoute(id);

		return new ResponseEntity<Route>(route, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteRoute(@PathVariable Integer id) {

		String msg = service.deleteRoute(id);

		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}

	@GetMapping("/source/{source}")
	public ResponseEntity<List<Route>> getBySource(@PathVariable String source) {

		List<Route> msg = service.getBySource(source);

		return new ResponseEntity<List<Route>>(msg, HttpStatus.OK);

	}

	@GetMapping("/destination/{destination}")
	public ResponseEntity<List<Route>> getByDestination(@PathVariable String destination) {

		List<Route> msg = service.getByDestination(destination);

		return new ResponseEntity<List<Route>>(msg, HttpStatus.OK);
	}

	@GetMapping("/search/{source}/{destination}")
	public ResponseEntity<List<Route>> getBySourceAndDestination(@PathVariable String source, @ PathVariable String destination) {

		List<Route> msg = service.getByDestination(destination);

		return new ResponseEntity<List<Route>>(msg, HttpStatus.OK);
	}
	

}
