package com.ata.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RouteRequestDTO {

	@NotBlank(message = "Source is required")
	private String source;
	@NotBlank(message = "Destination is required")
	private String destination;

	@NotNull(message = "Distance is required")
	private Double distanceInKm;
	@NotNull(message = "Estimated time is required")
	private Double estimatedTime;

}
