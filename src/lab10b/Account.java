package lab10b;

public class Account implements Comparable<Account> {
	

	private int id;
	private double balance;
	private String owner;
	private static int sortType;
	
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}
	
	void deposit(double amount) {
		
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
	}
	
	static void setSortType(int type) {
		sortType = 1;
	}

	@Override
	public int compareTo(Account o) {
		//Accounts by owner
		if (sortType == 1) {
			return this.owner.compareToIgnoreCase(o.owner); 
		}
		//Accounts by their balance type
		return (int)(this.balance - o.balance);
	
	};

}
