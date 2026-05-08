package com.ata.repository;

import com.ata.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    Optional<Vehicle> findByVehicleNo(String vehicleNo);

    List<Vehicle> findByStatus(String status);

    List<Vehicle> findByDriverId(Long driverId);
}
