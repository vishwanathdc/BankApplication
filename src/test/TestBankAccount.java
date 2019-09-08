package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BankingSystem.BankAccount;
import BankingSystem.EmailSubscriber;

class TestBankAccount {

	BankAccount ba;
	EmailSubscriber s1;
	
	@BeforeEach 
	public void setUp(){
		ba = new BankAccount ("vishwanath", "101", 1000);
		s1 = new EmailSubscriber ("vishwanath");
		ba.subscribe(s1);
		s1.subscribechannel(ba);
	}
	
	@Test
	public void testDeposit() {
		ba.deposit(3000);
		assertEquals(4000, ba.getBalance(), "checking deposit");
	}
	
	@Test
	public void testWithdraw() {
		ba.withdraw(500);
		assertEquals(500, ba.getBalance(), "checking withdrawal");
	}
	
	@Test
	public void testPreviousTransaction() {
		ba.deposit(3000);
		assertEquals(3000, ba.getPreviousTransaction(), "checking previous trasaction");
	}
	
	@Test
	public void testBalance() {
		ba.deposit(3000);
		assertEquals(4000, ba.getBalance(), "checking balance");
	}
}
