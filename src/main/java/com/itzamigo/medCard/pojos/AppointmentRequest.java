package com.itzamigo.medCard.pojos;

import java.util.Date;

public class AppointmentRequest {
    private long id;
    private String specialist;
    private String doctorFullName;
    private String diagnosis;
    private String complaints;

    private Date dateOfVisit;
    private int pat_id;

    public AppointmentRequest() {
    }

    public AppointmentRequest(long id, String specialist, String doctorFullName, String diagnosis, String complaints, Date dateOfVisit, int pat_id) {
        this.id = id;
        this.specialist = specialist;
        this.doctorFullName = doctorFullName;
        this.diagnosis = diagnosis;
        this.complaints = complaints;
        this.dateOfVisit = dateOfVisit;
        this.pat_id = pat_id;
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
