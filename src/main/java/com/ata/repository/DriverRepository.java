package com.ata.repository;

import com.ata.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findByContactNo(String contactNo);

    Optional<Driver> findByLicenseNo(String licenseNo);

    List<Driver> findByStatus(String status);
}
