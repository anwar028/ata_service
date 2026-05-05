package com.ata.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ata.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
