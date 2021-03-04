package com.dealership.model;

public class Customer {
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

    public Customer(int ID, String firstName, String lastName, String email, String username, String password) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public String getFistName() {
        return firstName;
    }

    public String geLastName() {
        return lastName;
    }

    public void setFistName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) { this.lastName = lastName; }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
