package com.example.demo.Models;

import java.time.LocalDate;

public class Eductaion {

    private String educationId;
    private String degree;
    private String institution;
    private String major;
    private LocalDate startDate;
    private LocalDate endDate;
    private double gpa;

    public Eductaion(String educationId, String degree, String institution, String major, LocalDate startDate, LocalDate endDate, double gpa) {
        this.educationId = educationId;
        this.degree = degree;
        this.institution = institution;
        this.major = major;
        this.startDate = startDate;
        this.endDate = endDate;
        this.gpa = gpa;
    }

    public String getEducationId() {
        return educationId;
    }

    public void setEducationId(String educationId) {
        this.educationId = educationId;

    }
    public String getDegree() {
        return degree;

    }
    public void setDegree(String degree) {
        this.degree = degree;
        
    }
    public String getInstitution() {
        return institution;

    }
    public void setInstitution(String institution) {
        this.institution = institution;

    }
    public String getMajor() {
        return major;

    }
    public void setMajor(String major) {
        this.major = major;

    }
    public LocalDate getStartDate() {
        return startDate;

    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;

    }
    public LocalDate getEndDate() {
        return endDate;
        
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


}
