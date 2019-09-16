package com.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankAccountFactory {

    private static final Logger log = LoggerFactory.getLogger(BankApplication.class);

    public BankAccountInterface createAccount(String name, String id, Integer amount, String notificationType) {
        if(name == null || id == null || amount == null || notificationType == null)
            return null;
        else {
            Observer s1;
            if(notificationType == "email")
                s1 = new EmailSubscriber(name);
            else
                s1 = new SmsSubscriber(name);
            BankAccountInterface tempobj = new BankAccount(name, id, amount);
            log.info("user account created- {}", name);
            tempobj.subscribe(s1);
            //s1.subscribechannel(tempobj);
            return tempobj;
        }
    }
}

