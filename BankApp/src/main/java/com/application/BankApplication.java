package com.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankApplication {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BankAccountFactory factory = new BankAccountFactory();
        BankAccountInterface vishwanath = factory.createAccount("vishwanath", "1001", 5000, "sms");
        vishwanath.showMenu();
    }
}
