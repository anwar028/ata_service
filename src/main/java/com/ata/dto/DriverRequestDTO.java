package com.ata.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DriverRequestDTO {

	@NotBlank(message = "Driver name is required")
	private String name;

	@NotBlank(message = "License no is required")
	private String licenseNo;

	@NotBlank(message = "Contact no is required")
	private String contactNo;

	@NotBlank(message = "Address is required")
	private String address;

}
