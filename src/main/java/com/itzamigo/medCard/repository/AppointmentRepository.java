package com.itzamigo.medCard.repository;

import com.itzamigo.medCard.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {


    @Query(value = "select * from appointments where doctor_full_name=?", nativeQuery = true)
    List<Appointment> findByDoctorFullName(String name);

    @Query(value = "select * from appointments where pat_id=?", nativeQuery = true)
    List<Appointment> FindByAppointmentByPatId(int pat_id);
}