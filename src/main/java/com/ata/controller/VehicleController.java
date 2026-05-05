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

import com.ata.dto.VehicleRequestDTO;
import com.ata.entity.Vehicle;
import com.ata.service.VehicleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

	private VehicleService service;

	public VehicleController(VehicleService service) {
		this.service = service;
	}

	@PostMapping(value  =  "/add", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> addVehicle(@Valid @RequestBody VehicleRequestDTO dto) {

		String vehicle = service.addVehicle(dto);

		return new ResponseEntity<>(vehicle, HttpStatus.CREATED);

	}

	@GetMapping("/all")
	public ResponseEntity<List<Vehicle>> getAllVehicles() {

		List<Vehicle> allVehicles = service.getAllVehicles();

		return new ResponseEntity<List<Vehicle>>(allVehicles, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Vehicle> getVehicle(@PathVariable Integer id) {

		Vehicle vehicle = service.getVehicle(id);

		return new ResponseEntity<Vehicle>(vehicle, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteVehicle(@PathVariable Integer id) {

		String deleteVehicle = service.deleteVehicle(id);

		return new ResponseEntity<String>(deleteVehicle, HttpStatus.OK);
	}
}
