package BankingSystem;

public class BankAccountFactory {
	public BankAccountInterface getInput(String name, String id, Integer amount, String notifier) {
		if(name == null || id == null || amount == null || notifier == null)
			return null;
		else {
			Observer s1;
			if(notifier == "email")
				s1 = new EmailSubscriber(name);
			else
			    s1 = new SmsSubscriber(name);
			BankAccountInterface tempobj = new BankAccount(name, id, amount);
			tempobj.subscribe(s1);
			s1.subscribechannel(tempobj);
			return tempobj;
		}
	}
}
