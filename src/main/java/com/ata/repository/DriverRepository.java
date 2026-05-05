package com.ata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ata.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
