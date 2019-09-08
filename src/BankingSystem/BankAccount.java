package BankingSystem;
import java.util.Scanner;

public class BankAccount implements BankAccountInterface{
	private int balance;
	private int previousTransaction;
	private String customerName;
	private String customerID;
	
	Observer sub;
	
	public void subscribe(Observer sub) {
		this.sub = sub;
	}
	
	public void notifySubscriber(String title) {
			this.sub.update(title);
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public int getPreviousTransaction() {
		return previousTransaction;
	}
	
	public void setPreviousTransaction(int previousTransaction) {
		this.previousTransaction = previousTransaction;
	}
	
	public BankAccount(String customerName, String customerID, int balance) {
		setCustomerName(customerName);
		setCustomerID(customerID);
		setBalance(balance);
		setPreviousTransaction(balance);
	}
	
	public void deposit(int amount) {
		if(amount != 0) {
			int balance = getBalance();
			balance += amount;
			setBalance(balance);
			setPreviousTransaction(amount);
			notifySubscriber("deposited amount: " + amount);
		}
	}
	
	public void withdraw(int amount) {
		if(amount != 0) {
			int balance = getBalance();
			balance -= amount;
			setBalance(balance);
			setPreviousTransaction(-amount); 
			notifySubscriber("withdrawn amount: " + amount);
		}
	}

	public void previousTransactionDisplay() {
		int previousTransaction = getPreviousTransaction();
		if(previousTransaction <= 0)
			System.out.println("amount withdrawn: " + Math.abs(previousTransaction));
		else
			System.out.println("amount deposited: " + previousTransaction);
	}
	
	public void showMenu() {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Customer: " + getCustomerName());
		System.out.println("CustomerID: " + getCustomerID());
		System.out.println("enter your option");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check balance");
		System.out.println("4. Previous Transaction");
		System.out.println("5. Exit");
		
		do {
			System.out.println("*********************************************************");
			System.out.println("Enter your option");
			System.out.println("*********************************************************");
			choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("**********************");
					System.out.println("Enter the amount to deposit");
					System.out.println("**********************");
					int amount = sc.nextInt();
					deposit(amount);
					System.out.println();
					break;
				case 2:
					System.out.println("**********************");
					System.out.println("Enter the amount to withdraw");
					System.out.println("**********************");
					int withdraw  = sc.nextInt();
					withdraw(withdraw);
					System.out.println();
					break;
				case 3:
					System.out.println("**********************");
					System.out.println("your balance: " + getBalance());
					System.out.println("**********************");
					System.out.println();
					break;
				case 4:
					System.out.println("**********************");
					previousTransactionDisplay();
					System.out.println("**********************");
					System.out.println();
					break;
				case 5:
					System.out.println("**********************");
					break;
				default:
					System.out.println("**********************");
					System.out.println("incorrect option, please try again");
					System.out.println("**********************");
					System.out.println();
					break;
			}
			
		}while(choice != 5);
		System.out.println("Thank you for using our services. Good bye!");
	}

}
