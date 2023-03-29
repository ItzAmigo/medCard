package com.itzamigo.medCard.controller;

import com.itzamigo.medCard.entity.Appointment;
import com.itzamigo.medCard.pojos.AppointmentRequest;
import com.itzamigo.medCard.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("getappointment")
    public Appointment getAppointment(String doctorFullName){
        return appointmentService.getAppointment(doctorFullName);
    }

    @PostMapping("saveappointment")
    public Appointment addAppointment(@RequestBody AppointmentRequest appointmentRequest){
        return  appointmentService.addAppointment(appointmentRequest);
    }
}