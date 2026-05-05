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

import com.ata.dto.DriverRequestDTO;
import com.ata.entity.Driver;
import com.ata.service.DriverService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/driver")
public class DriverController {

	private DriverService service;

	public DriverController(DriverService service) {

		this.service = service;
	}

	@PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> addDriver(@Valid @RequestBody DriverRequestDTO dto) {

		String driverAdded = service.addDriver(dto);
		return new ResponseEntity<>(driverAdded, HttpStatus.CREATED);

	}

	@GetMapping("/{id}")
	public ResponseEntity<Driver> getDriver(@PathVariable Integer id) {

		Driver driver = service.getDriver(id);
		return new ResponseEntity<>(driver, HttpStatus.OK);

	}

	@GetMapping("/all")
	public ResponseEntity<List<Driver>> getAllDrivers() {

		List<Driver> allDrivers = service.getAllDrivers();
		return new ResponseEntity<>(allDrivers, HttpStatus.OK);

	}

	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteDriver(@PathVariable Integer id) {

		String driverDelete = service.deleteDriver(id);

		return new ResponseEntity<>(driverDelete, HttpStatus.OK);

	}
}
