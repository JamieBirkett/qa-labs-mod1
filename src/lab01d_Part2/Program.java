package lab01d_Part2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Part 2 - How long does it take to double your money
		int initialInvestment = 100;
		int interestRate = 5;
		
		double totalYears = calculateYearsToDoubleInvestment(initialInvestment, interestRate);
		System.out.println("With a " + interestRate + "% interest rate, it would take " + totalYears + " to double investment");
		
		//Part 3 - Nested loop practice

		multiplicationTable();
	}
	
	public static double calculateYearsToDoubleInvestment(int investment, int rate) {
		double interest = investment;
		
		double years = 0;
		while (interest < 200) {
			years += 1;
			interest += interest * rate / 100;
			System.out.println(interest);
		}
 		
		return years;
	}
	
	public static void multiplicationTable() {
		int table = 10;
		for(int row = 1; row <= table; row++ ) {
			for (int col = 1; col <= table; col++) {
				System.out.printf("%5d", col * row);
			}
			System.out.println();
		}
	}

}
