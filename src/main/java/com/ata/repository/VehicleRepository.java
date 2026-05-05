package com.ata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ata.entity.Vehicle;

public interface VehicleRepository  extends JpaRepository<Vehicle, Integer>{
	

}
