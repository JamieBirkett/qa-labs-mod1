package lab02b;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
		// Part 1
		Account account = new Account();
		
		account.deposit(100);
		account.withdraw(55);
		System.out.println(account.getDetails());
		
		// Part 2 
		Account[] accounts = { new Account(2,"Harry", 200), new Account(3,"Sally", 65), new Account(4,"Bob", 1000) };
		
		for(Account instance : accounts) {
			System.out.println(instance.getDetails());
		}
		
		// Part 3 - Passing reference types to a method 
		
		Account myAccount = new Account(4,"Jerry",100);
		
		myAccount.addInterst();
		System.out.println(myAccount.getDetails());
		
		Account partnerAccount = myAccount;
		partnerAccount.addInterst();
		System.out.println(partnerAccount.getDetails());;
		
		processAccount(myAccount);
		System.out.println(myAccount.getDetails());
		
		int k = 100;
		incInt(k);
		System.out.println(k);

		// part 4
		//Account[] accounts = { new Account(2,"Harry", 200), new Account(3,"Sally", 65), new Account(4,"Bob", 1000) };
		Bank bank = new Bank();
		bank.addAccount("Liz", 0);
		bank.addAccount("Phil", 200);
		bank.addAccount("Dom", 300);
		
		bank.addAccount("Brad", 3652);
		
		bank.getAccount("Dom");
		bank.getAccount("Brad");
		

	}
	
	static void processAccount(Account acc) {
		acc.addInterst();
	}
	
	private static void incInt(int x) {
		x++;
	}
	

}
