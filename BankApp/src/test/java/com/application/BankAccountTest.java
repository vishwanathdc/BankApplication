package com.application;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    BankAccount ba;
    EmailSubscriber s1;

    @Before
    public void setUp() throws Exception {
        ba = new BankAccount ("vishwanath", "101", 1000);
        s1 = new EmailSubscriber ("vishwanath");
        ba.subscribe(s1);
    }

    @Test
    public void deposit() {
        ba.deposit(3000);
        assertEquals(4000, ba.getBalance(), "checking deposit");
    }

    @Test
    public void withdraw() {
        ba.withdraw(500);
        assertEquals(500, ba.getBalance(), "checking withdrawal");
    }

    @Test
    public void previousTransactionDisplay() {
        ba.deposit(3000);
        assertEquals(3000, ba.getPreviousTransaction(), "checking previous trasaction");
    }

    @Test
    public void calculateInterest() {
        assertEquals(20, ba.calculateInterest(1000, 1));
    }
}