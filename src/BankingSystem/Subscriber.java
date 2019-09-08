package BankingSystem;

public abstract class Subscriber implements Observer{
	protected String name;
	protected BankAccountInterface bankaccount;
	protected String notification;
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	public void update(String title) {
		notification = "Hello " + name + " " + "you have " + title;
		display();
	}
	
	public void subscribechannel(BankAccountInterface ba) {
		bankaccount = ba;
	}
	protected abstract void display();
}
