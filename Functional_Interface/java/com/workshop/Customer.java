package com.workshop;

import java.util.List;

public class Customer {

    private int id;
    private String location;
    private String emailId;
    private String contactNo;
    private List<Address> addresses;

    //default constructor
    public Customer() {
    }

    //parameterized constructor
    public Customer(int id, String location, String emailId, String contactNo, List<Address> addresses) {
        this.id = id;
        this.location = location;
        this.emailId = emailId;
        this.contactNo = contactNo;
        this.addresses = addresses;
    }

    // setters and getters are setting and getting the values
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    // print the address object using toString method
    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", location='" + location + '\'' + ", emailId='" + emailId + '\'' + ", contactNo='" + contactNo + '\'' + ", addresses=" + addresses + '}';
    }
}
