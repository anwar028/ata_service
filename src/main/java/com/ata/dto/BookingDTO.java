package com.ata.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDTO {
    private Long bookingId;

    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Vehicle ID is required")
    private Long vehicleId;

    @NotNull(message = "Route ID is required")
    private Long routeId;

    @NotNull(message = "Journey date is required")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate journeyDate;

    @NotBlank(message = "Boarding point is required")
    private String boardingPoint;

    @NotBlank(message = "Drop point is required")
    private String dropPoint;

    @NotNull(message = "Number of passengers is required")
    @Min(value = 1, message = "Number of passengers must be at least 1")
    private Integer numberOfPassengers;

    private Double fare;
    private String bookingStatus;
}
