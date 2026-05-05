package com.ata.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ata.dto.DriverRequestDTO;
import com.ata.entity.Driver;
import com.ata.repository.DriverRepository;
import com.ata.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	private DriverRepository driverRepo;

	public DriverServiceImpl(DriverRepository driverRepo) {

		this.driverRepo = driverRepo;
	}

	@Override
	public String addDriver(DriverRequestDTO dto) {

		Driver driver = new Driver();

		driver.setDriverId((int) (Math.random() * 1000) + 1);
		driver.setAddress(dto.getAddress());
		driver.setContactNo(dto.getContactNo());
		driver.setLicenseNo(dto.getLicenseNo());
		driver.setName(dto.getName());

		driverRepo.save(driver);

		return "Driver added successfully";
	}

	@Override
	public Driver getDriver(Integer id) {
		return driverRepo.findById(id).orElseThrow(() -> new RuntimeException("Driver not found"));
	}

	@Override
	public List<Driver> getAllDrivers() {

		return driverRepo.findAll();
	}

	@Override
	public String deleteDriver(Integer id) {

		driverRepo.deleteById(id);

		return "Driver deleted successsfully";
	}

	@Override
	public String updateDriver(Integer id, DriverRequestDTO dto) {

		Driver driver = driverRepo.findById(id).orElseThrow(() -> new RuntimeException("Driver not found"));

		driver.setAddress(dto.getAddress());
		driver.setContactNo(dto.getContactNo());
		driver.setLicenseNo(dto.getLicenseNo());
		driver.setName(dto.getName());

		driverRepo.save(driver);

		return "Driver updated successfully";
	}

}
