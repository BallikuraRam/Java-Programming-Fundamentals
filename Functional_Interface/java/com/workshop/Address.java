package com.workshop;

public class Address {

    private String doorNo;
    private String streetName;
    private String cityName;

    //default constructor
    public Address() {
    }

    //parameterized constructor
    public Address(String doorNo, String streetName, String cityName) {
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.cityName = cityName;
    }

    // setter and getters to set and get the values
    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    // print the address object using toString method
    @Override
    public String toString() {
        return "Address{" + "doorNo='" + doorNo + '\'' + ", streetName='" + streetName + '\'' + ", cityName='" + cityName + '\'' + '}';
    }
}
