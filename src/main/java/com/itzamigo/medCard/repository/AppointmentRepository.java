package com.itzamigo.medCard.repository;

import com.itzamigo.medCard.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    Appointment findByDoctorFullName(String doctorFullName);
}