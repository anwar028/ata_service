package com.ata.service;

import java.util.List;

import com.ata.dto.VehicleRequestDTO;
import com.ata.entity.Vehicle;

public interface VehicleService {

	String addVehicle(VehicleRequestDTO dto);

	List<Vehicle> getAllVehicles();

	Vehicle getVehicle(Integer id);

	String deleteVehicle(Integer id);
	

}
