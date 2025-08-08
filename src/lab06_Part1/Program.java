package lab06_Part1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = null;
		account = new Account(123456, "Jamie", 100);
		
		account.withdraw(60);
		System.out.println(account.getDetails());
		
		try {
			account.withdraw(50);
		}
		catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			account.close();
		}
		System.out.println(account.getDetails());
		
	}

}
