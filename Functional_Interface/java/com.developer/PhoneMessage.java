package com.developer;

public class PhoneMessage implements Message {
    @Override
    public void textMessage(String message) {
        System.out.println("Phone Message ::: " + message);
    }
}
