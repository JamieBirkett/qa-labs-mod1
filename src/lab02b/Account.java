package lab02b;

public class Account {
	private int id;
	private String owner;
	private double balance;
	
	//Constructors | Getters/Setters
	
	public Account() {
		this.id = 1;
		this.owner = "Jamie";
		this.balance = 100.00;
		
	}
	
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
		
	}
	
	public String getDetails() {
		return "ID: " + id + " | " + "Owner: " + getOwner() + " | " + "Balance: " + balance;
	}
	
	//Methods
	
	void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Amount cannout be less than 0!");
	
		}
		else {
		
		balance += amount;
		System.out.println("£" + amount + " deposited.");
	
		}
	}
	
	void withdraw(double amount) {
		if (balance <= 0) {
			System.out.println("Cannot withdraw, balance is 0!");	
		}
		else {
		balance -= amount;
		System.out.println("£" + amount + " withdrawn.");
	
		}
	}
	
	void addInterst() {
	double interest = 2.5;
	balance += balance * interest / 100;
	System.out.println("£" + balance + " after interest.");
	
	}

	public String getOwner() {
		return owner;
	}


}
