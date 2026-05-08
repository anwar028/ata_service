package com.ata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    @Column(nullable = false, unique = true)
    private String vehicleNo;

    @Column(nullable = false)
    private String vehicleName;

    @Column(nullable = false)
    private Integer seatingCapacity;

    @Column(nullable = false)
    private String vehicleType;

    @Column(nullable = false)
    private Double farePerKm;

    @ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;

    @Column(nullable = false)
    private String status; // ACTIVE, INACTIVE
}
