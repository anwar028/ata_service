package com.ata.service;

import java.util.List;

import com.ata.dto.DriverRequestDTO;
import com.ata.entity.Driver;

public interface DriverService {

	String addDriver(DriverRequestDTO dto);

	Driver getDriver(Integer id);

	List<Driver> getAllDrivers();

	String deleteDriver(Integer id);

}
