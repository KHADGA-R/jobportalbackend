package com.example.demo.Models;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String role;
    private String profilePicture;
    private LocalDateTime createdAt;
    
    
    
    public User(Long id, String firstName, String lastName, String email, String password, String phoneNumber, String address, String role, String profilePicture) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email.toLowerCase(); // normalize email
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.role = role;
        this.profilePicture = profilePicture;

        this.createdAt = LocalDateTime.now();
    };

    //Getters and Setters
    public Long getId() {
        return id;
    };

    public void setId(Long id) {
        this.id = id;
    };

    public String getFirstName(){
        return firstName;
    };

    public void setFirstName(String firstName){
        this.firstName = firstName;
    };

    public String getLastName(){
        return lastName;
    };

    public void setLastName(String lastName){
        this.lastName = lastName;
    };

    public String getEmail(){
        return email;
    };

    public void setEmail(String email){
        this.email = email;
    };

    public String getPassword(){
        return password;
    };

    public void setPassword(String password){
        this.password = password;
    };

    public String getPhoneNumber(){
        return phoneNumber;
    };

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    };

    public String getAddress(){
        return address;
    };

    public void setAddress(String address){
        this.address = address;
    };

    public String getRole(){
        return role;
    };

    public void setRole(String role){
        this.role = role;
    };

    public String getProfilePicture(){
        return profilePicture;
    };

    public void setProfilePicture(String profilePicture){
        this.profilePicture = profilePicture;
    };

};




