package com.itzamigo.medCard.controller;

import com.itzamigo.medCard.entity.Appointment;
import com.itzamigo.medCard.entity.Patient;
import com.itzamigo.medCard.pojos.AppointmentRequest;
import com.itzamigo.medCard.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    AppointmentService appointmentService;

    @GetMapping("sayhello")
    public String sayHello() {
        return "hi";
    }

    @GetMapping("getappointments")
    public List<Appointment> getAppointments(){
        return appointmentService.getAppointments();
    }

    @PostMapping("addappointment")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        return appointmentService.saveAppointment(appointment);

    }

    @RequestMapping(value="/getappointment",method= RequestMethod.GET, headers = "Accept=application/json")
    public List<Appointment> getAppointment(@RequestParam String doctorFullName){
        return appointmentService.getAppointment(doctorFullName);
    }

    @RequestMapping(value="/getAppointmentsByPatId/{pat_id}",method= RequestMethod.GET, headers = "Accept=application/json")
    public List<Appointment> getAppointmentsByPatId(@PathVariable int pat_id){
        return appointmentService.getAppointmentByPatId(pat_id);
    }

    @PostMapping("saveappointment")
    public Appointment addAppointment(@RequestBody AppointmentRequest appointmentRequest){
        return  appointmentService.addAppointment(appointmentRequest);
    }

    @DeleteMapping("deleteappointmentbyid/{id}")
    public void deleteAppointment(@PathVariable("id") Long id) {
        appointmentService.deleteAppointment(id);
    }

    @RequestMapping(value="/getpatients",method= RequestMethod.GET, headers = "Accept=application/json")
    @CrossOrigin
    public List<Patient> getPatients(){
        return appointmentService.getPatients();
    }

    @PostMapping("addpatient")
    public Patient savePatient(@RequestBody Patient patient){
        return appointmentService.savePatient(patient);

    }

    @GetMapping("getpatient")
    public Patient getPatient(@RequestParam("fullName") String fullName){
        return appointmentService.getPatient(fullName);
    }

    @GetMapping("getpatientbyiin")
    public Patient getPatientByIIN(String iin){
        return appointmentService.getPatientByIIN(iin);
    }


}