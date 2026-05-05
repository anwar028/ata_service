package com.ata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vehicleId;
	private String vehicleNo;
	private String vehicleName;
	private Integer seatingCapacity;
	private String vehicleType;
	private Double farePerKm;

	@OneToOne
	@JoinColumn(name = "driver_Id")
	private Driver driver;

}
