package com.itzamigo.medCard.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

import java.util.Date;

@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @Column(name = "app_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "specialist")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я '&/.,()-]{3,60}$")
    private String specialist;

    @Pattern(regexp = "^[a-zA-Zа-яА-Я '&/.,()-]{10,60}$")
    @Column(name = "doctor_full_name")
    private String doctorFullName;

    @Pattern(regexp = "^[a-zA-Zа-яА-Я '&/.,()-]{5,255}$")
    @Column(name = "diagnosis")
    private String diagnosis;

    @Pattern(regexp = "^[a-zA-Zа-яА-Я '&/.,()-]{1,255}$")
    @Column(name = "complaints")
    private String complaints;

    @Column(name = "date_of_visit")
    private Date dateOfVisit;

    @Column(name = "pat_id")
    private int pat_id;

    @ManyToOne
    @JoinColumn(name = "pat_id", insertable = false, updatable = false)
    private Patient patient;

    public Appointment() {
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getDoctorFullName() {
        return doctorFullName;
    }

    public void setDoctorFullName(String doctorFullName) {
        this.doctorFullName = doctorFullName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getComplaints() {
        return complaints;
    }

    public void setComplaints(String complaints) {
        this.complaints = complaints;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public int getPat_id() {
        return pat_id;
    }

    public void setPat_id(int pat_id) {
        this.pat_id = pat_id;
    }


}