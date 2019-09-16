package com.application;

public class EmailSubscriber extends Subscriber{

    public EmailSubscriber(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void display() {
        System.out.println("this is an email notification");
        System.out.println(notification);
    }
}
