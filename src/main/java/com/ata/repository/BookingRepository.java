package com.ata.repository;

import com.ata.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId);

    List<Booking> findByVehicleId(Long vehicleId);

    List<Booking> findByJourneyDate(LocalDate journeyDate);

    List<Booking> findByBookingStatus(String bookingStatus);

    List<Booking> findByUserIdAndBookingStatus(Long userId, String bookingStatus);
}
