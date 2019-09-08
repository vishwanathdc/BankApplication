package BankingSystem;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountFactory factory = new BankAccountFactory();
		BankAccountInterface vishwanath = factory.getInput("vishwanath", "1001", 5000, "sms");	
		vishwanath.showMenu();
	}
}
