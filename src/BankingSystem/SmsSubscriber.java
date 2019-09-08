package BankingSystem;

public class SmsSubscriber extends Subscriber{

	public SmsSubscriber(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("this is a SMS notification");
		System.out.println(notification);
	}

}
