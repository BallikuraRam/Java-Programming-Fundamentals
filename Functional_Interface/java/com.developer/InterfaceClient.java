package com.developer;

public class InterfaceClient {
    public static void main(String[] args) {
        // creating Message interface object pointing to implementation class
        Message message = new PhoneMessage();

        //calling interface method
        message.textMessage("... Welcome to new java world ...........");
    }
}
