package com.itzamigo.medCard.service;

import com.itzamigo.medCard.entity.Appointment;
import com.itzamigo.medCard.entity.Patient;
import com.itzamigo.medCard.pojos.AppointmentRequest;
import com.itzamigo.medCard.repository.AppointmentRepository;
import com.itzamigo.medCard.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;
    @Autowired
    PatientRepository patientRepository;

    public AppointmentService() {

    }

    public List<Appointment> getAppointments(){
        return appointmentRepository.findAll();
    }

    public Appointment saveAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }


    public List<Appointment> getAppointment(String doctorFullName){
        return appointmentRepository.findByDoctorFullName(doctorFullName);
    }


    public Appointment addAppointment(AppointmentRequest appointmentrequest) {
        //Patient patient = patientRepository.findbyId(appointmentrequest.getPat_id());

        Appointment appointment = new Appointment();
        appointment.setSpecialist(appointmentrequest.getSpecialist());
        appointment.setDoctorFullName(appointmentrequest.getDoctorFullName());
        appointment.setDiagnosis(appointmentrequest.getDiagnosis());
        appointment.setComplaints(appointmentrequest.getComplaints());
        appointment.setDateOfVisit(appointmentrequest.getDateOfVisit());
       // appointment.setPatient(patient);
        return appointmentRepository.save(appointment);
    }

    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient getPatient(String fullName) {
        return patientRepository.findByFullName(fullName);
    }

    public Patient getPatientByIIN(String iin) {
        return patientRepository.findByIIN(iin);
    }

    public void deleteAppointment(Long id) {
        appointmentRepository.deleteById(id);
    }

    public List<Appointment> getAppointmentByPatId(int pat_id) {
        return appointmentRepository.FindByAppointmentByPatId(pat_id);
    }
}