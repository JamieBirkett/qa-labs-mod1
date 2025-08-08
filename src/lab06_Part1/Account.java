package lab06_Part1;

public class Account {
	

	private int id;
	private double balance;
	private String owner;
	
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}
	
	void deposit(double amount) {
		/*
		if (amount < 0) { // Change this to an exception
			System.out.println("Amount cannout be less than 0!");
	
		}
		else {
			balance += amount;
	
		}
		*/
		
		balance += amount;
	}
	
	void withdraw(double amount) {
		double newBalance = balance - amount;
	
		if (newBalance <= 0) {
			throw new IllegalArgumentException("Cannot withdraw: Balance would be less than £0");	
		}
		else {
			balance -= amount;
	
		}

		
	}
	
	void close() {
		System.out.println("Account: " + id + " is closed");
	};
	
	String getDetails() {
		
		String accountDetails = String.format("Account: %d \n%s | £%.2f \n", id, owner, balance); 
		
		return accountDetails;
	};

}
