package BankingSystem;

public class BankAccountFactory {
	public BankAccountInterface getInput(String name, String id, Integer amount) {
		if(name == null || id == null || amount == null)
			return null;
		return new BankAccount(name, id, amount);
	}
}
