package com.itzamigo.medCard.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

import java.util.Set;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pat_id")
    private int id;

    @Column(name = "iin")
    @Pattern(regexp = "^[0-9]{12}$")
    private String IIN;

    @Column(name = "full_name")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я '&/.,()-]{10,60}$")
    private String fullName;

    @Column(name = "address")
    @Pattern(regexp = "^[a-zA-Zа-яА-Я .,:;'/&()-]{5,60}$")
    private String address;

    @Column(name = "number")
    @Pattern(regexp = "^[0-9 +()-]{11,20}$")
    private String number;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name = "pat_id")
    private Set<Appointment> appointments;

    public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(Set<Appointment> appointments) {
        this.appointments = appointments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIIN() {
        return IIN;
    }

    public void setIIN(String IIN) {
        this.IIN = IIN;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}