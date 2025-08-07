package lab02b;

public class Bank {
	
	Account[] accounts = new Account[3];
	
	Account addAccount(String owner, double balance) {

		int id = 0;
		for(Account account : accounts) {
	
			id +=1;
			if(account == null) {
				break;
			}
		}
		
		if(accounts[id-1] == null) {
			Account myAccount = new Account(id, owner, balance);
			accounts[id-1] = myAccount;
			System.out.println(owner + " - Added to array");
			return myAccount;
		}
		
		
		System.out.println(owner + " - Not added. Array is full");
	
		return null;
	}
	
	Account getAccount(String owner) {
		for(Account account: accounts) {
			if(account.getOwner().equals(owner)) {
				System.out.println("Found account for: " + owner);
				return account;
			}
			
		}
		System.out.println("Couldn't find account for: " + owner);
		return null;
	}

}
