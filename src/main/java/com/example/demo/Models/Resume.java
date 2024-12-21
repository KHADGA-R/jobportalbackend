package com.example.demo.Models;

import java.util.List;
import java.time.LocalDate;

public class Resume {
   
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String linkedInUrl;

    //Professional summary
    private String professionalSummary;

    //Education
    private List<Eductaion> education;

    //Experience
    private List<Experience> experience;

    //Skills
    private List<String> skills;


    // Inner classes for Education and Work Experiences
    public static class Educataion {
        private String schoolName;
        private String degree;
        private String major;
        private LocalDate startDate;
        private LocalDate endDate;
        private double gpa;

        public Educataion(String schoolName, String degree, String major, LocalDate startDate, LocalDate endDate, double gpa) {
            this.schoolName = schoolName;
            this.degree = degree;
            this.major = major;
            this.startDate = startDate;
            this.endDate = endDate;
            this.gpa = gpa;
        }

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        public String getDegree() {
            return degree;
        }

        public void setDegree(String degree) {
            this.degree = degree;
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

    public static class Experience {
        private String companyName;
        private String jobTitle;
        private String location;
        private LocalDate startDate;
        private LocalDate endDate;
        private List<String> responsibilities;

        public Experience(String companyName, String jobTitle, String location, LocalDate startDate, LocalDate endDate, List<String> responsibilities) {
            this.companyName = companyName;
            this.jobTitle = jobTitle;
            this.location = location;
            this.startDate = startDate;
            this.endDate = endDate;
            this.responsibilities = responsibilities;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public String getJobTitle() {
            return jobTitle;
        }

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
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

        public List<String> getResponsibilities() {
            return responsibilities;
        }

        public void setResponsibilities(List<String> responsibilities) {
            this.responsibilities = responsibilities;
        }
    }
    public Resume(String firstName, String lastName, String email, String phoneNumber, String address, String linkedInUrl ) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.linkedInUrl = linkedInUrl;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getLinkedInUrl() {
        return linkedInUrl;
    }

    public void setLinkedInUrl(String linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public String getProfessionalSummary() {
        return professionalSummary;
    }

    public void setProfessionalSummary(String professionalSummary) {
        this.professionalSummary = professionalSummary;
    }

    public List<Eductaion> getEducation() {
        return education;
    }

    public void setEducation(List<Eductaion> education) {
        this.education = education;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    //Helper methods to add education and experience
    public void addEducation(Eductaion education) {
        this.education.add(education);
    }

    public void addExperience(Experience experience) {
        this.experience.add(experience);
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

}
