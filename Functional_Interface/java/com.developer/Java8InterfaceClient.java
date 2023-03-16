package com.developer;

public class Java8InterfaceClient {
    public static void main(String[] args) {

        //providing the implementation for Functional Interface abstract method
        Message phoneMsg = (String message) -> {
            System.out.println(message);
        };

        // calling the functional interface method
        phoneMsg.textMessage("Hi Good Morning Baby............");

        // proving the another implementation for functional interface abstract method
        Message emailMsg = (message) ->{
            System.out.println(message);
        };

        // calling the functional interface method
        emailMsg.textMessage("Hi This is Email Msg .........");
    }
}
