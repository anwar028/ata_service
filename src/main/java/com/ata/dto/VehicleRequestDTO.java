package com.ata.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class VehicleRequestDTO {

	@NotBlank(message = "Vehicle number is required")
	private String vehicleNumber;

	@NotBlank(message = "Vehicle name is required")
	private String vehicleName;

	@Min(value = 1, message = "Capacity should be greater than 0")
	private Integer seatingCapacity;

	private String vehicleType;
	
	private Double farePerKm;
	
	private Integer driverId;
}
