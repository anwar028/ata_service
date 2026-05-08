package com.ata.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleDTO {
    private Long vehicleId;

    @NotBlank(message = "Vehicle number is required")
    private String vehicleNo;

    @NotBlank(message = "Vehicle name is required")
    private String vehicleName;

    @NotNull(message = "Seating capacity is required")
    @Min(value = 1, message = "Seating capacity must be at least 1")
    private Integer seatingCapacity;

    @NotBlank(message = "Vehicle type is required")
    private String vehicleType;

    @NotNull(message = "Fare per km is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Fare per km must be greater than 0")
    private Double farePerKm;

    @NotNull(message = "Driver ID is required")
    private Long driverId;

    private String status;
}
