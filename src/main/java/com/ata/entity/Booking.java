package com.ata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "booking")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    @JoinColumn(name = "route_id", nullable = false)
    private Route route;

    @Column(nullable = false)
    private LocalDateTime bookingDate;

    @Column(nullable = false)
    private LocalDate journeyDate;

    @Column(nullable = false)
    private String boardingPoint;

    @Column(nullable = false)
    private String dropPoint;

    @Column(nullable = false)
    private Integer numberOfPassengers;

    @Column(nullable = false)
    private Double fare;

    @Column(nullable = false)
    private String bookingStatus; // CONFIRMED, CANCELLED, PENDING, COMPLETED

    @Column
    private LocalDateTime cancellationDate;

    @Column
    private String cancellationReason;
}
