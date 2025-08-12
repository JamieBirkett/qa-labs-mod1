package lab10b;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Account> accounts = new ArrayList<>( );
		accounts.add(new Account(100, "Bob", 1000));
		accounts.add(new Account(500, "Linda", 3000));
		accounts.add(new Account(300, "David", 2000));
		accounts.add(new Account(7000, "Annie", 20500));
		
		System.out.println("Unsorted Accounts: \n--------------");
		for (Account account : accounts) {
			System.out.println(account.getDetails());
		}
		Collections.sort(accounts);
		
		System.out.println("Sorted by balance: \n--------------");
		for (Account account : accounts) {
			System.out.println(account.getDetails());
		}
		
		Account.setSortType(1);
		Collections.sort(accounts);
		System.out.println("Sorted by Owner: \n--------------");
		for (Account account : accounts) {
			System.out.println(account.getDetails());
		}
	}
	

}
