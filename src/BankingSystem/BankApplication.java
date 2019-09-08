package BankingSystem;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountFactory vishwafactory = new BankAccountFactory();
		BankAccountInterface vishwanath = vishwafactory.getInput("vishwanath", "1001", 5000);
		vishwanath.showMenu();
	}
}
