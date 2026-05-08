package com.ata.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingStatusDTO {
    private Long bookingId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime bookingDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate journeyDate;

    private String source;
    private String destination;
    private String vehicleName;
    private String boardingPoint;
    private String dropPoint;
    private Integer numberOfPassengers;
    private Double fare;
    private String bookingStatus;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime cancellationDate;
    private String cancellationReason;
}
