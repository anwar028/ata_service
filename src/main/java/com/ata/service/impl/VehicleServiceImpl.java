package com.ata.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ata.dto.VehicleRequestDTO;
import com.ata.entity.Driver;
import com.ata.entity.Vehicle;
import com.ata.repository.DriverRepository;
import com.ata.repository.VehicleRepository;
import com.ata.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	private VehicleRepository vehiclerepo;
	private DriverRepository driverRepo;

	public VehicleServiceImpl(VehicleRepository vehiclerepo, DriverRepository driverRepo) {
		this.vehiclerepo = vehiclerepo;
		this.driverRepo = driverRepo;
	}

	@Override
	public String addVehicle(VehicleRequestDTO dto) {

		Driver driver = driverRepo.findById(dto.getDriverId())
				.orElseThrow(() -> new RuntimeException("Driver not found"));

		Vehicle vehicle = new Vehicle();

		vehicle.setDriver(driver);
		vehicle.setFarePerKm(dto.getFarePerKm());
		vehicle.setSeatingCapacity(dto.getSeatingCapacity());
		vehicle.setVehicleName(dto.getVehicleName());
		vehicle.setVehicleNo(dto.getVehicleNumber());
		vehicle.setVehicleType(dto.getVehicleType());

		vehiclerepo.save(vehicle);

		return "Value added successfully";

	}

	@Override
	public List<Vehicle> getAllVehicles() {

		return vehiclerepo.findAll();
	}

	@Override
	public Vehicle getVehicle(Integer id) {

		return vehiclerepo.findById(id).orElseThrow(() -> new RuntimeException("Vehicle not found"));
	}

	@Override
	public String deleteVehicle(Integer id) {

		vehiclerepo.deleteById(id);
		return "Vehicle deleted successfully";
	}

}
