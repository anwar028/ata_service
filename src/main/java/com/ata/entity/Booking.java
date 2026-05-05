package com.ata.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookingId;

	private LocalDate bookingDate;
	private LocalDate journeyDate;

	private String boardingPoint;
	private String dropPoint;
	private Integer noOfPassengers;
	private Double totalFare;
	private String bookingStatus;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	@ManyToOne
	@JoinColumn(name = "vehicle_id")
	private Vehicle vehicle;

	@ManyToOne
	@JoinColumn(name = "route_id")
	private Route route;

}
