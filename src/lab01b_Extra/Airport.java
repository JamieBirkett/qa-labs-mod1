package lab01b_Extra;

public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double currentCurrencyAmount = 100.0;
		System.out.println("Amount to convert: " + currentCurrencyAmount);
		
		String customerTypeIdentifier = "S";
		String customerType = "";
		
		switch (customerTypeIdentifier) {
		case "R":
			customerType = "Regular";
			break;
		case "V":
			customerType = "VIP";
			break;
		case "S":
			customerType = "Staff";
			break;
		default:
			customerType = "Regular";
			break;
		}
		
		System.out.println("Customer Type: " + customerType);
		
		int CurrencyIdentifier = 2;
		String currencyType = "USD";
		
		switch (CurrencyIdentifier) {
		case 1:
			currencyType = "USD";
			break;
		case 2:
			currencyType = "EUR";
			break;
		case 3: 
			currencyType = "JPY";
			break;
		default:
			currencyType = "GDP";
			break;
		}
		
		System.out.println("Currency: " + currencyType);
		
		//Enhanced Switch
		
		String currency = "USD";
		double fixedRate = 0;
		
		fixedRate = switch (currency) {
		case "USD" -> 1.25;
		case "EUR" -> 1.15;
		case "JPY" -> 180.50;
		default -> throw new IllegalArgumentException("Unknown Currency");
		
		};
		
		System.out.println("The rate is £" + fixedRate);
		
		double serviceFee = 0;
		
		if (currentCurrencyAmount < 100) {
			serviceFee = 5.0;
		}
		else if (currentCurrencyAmount >= 100) {
			serviceFee = 2.5;
		}
		System.out.println("Service Free: " + serviceFee);
		double airportTax = 0;
		
		airportTax = switch (customerType) {
		case "Regular" -> 0.10;
		case "VIP" -> 0.5;
		case "Staff" -> 0;
		default -> throw new IllegalArgumentException("Unknown Customer Type");
		
		};
		
		System.out.println("Airport Tax: " + airportTax);
		
		double totalServicefee =  currentCurrencyAmount * serviceFee / 100;
		double totalAirportTax = currentCurrencyAmount * airportTax /100;
		
		double totalAmountWithServiceFee = currentCurrencyAmount - totalServicefee;
		double totalAmountWithAirportTax = currentCurrencyAmount - totalAirportTax;
		System.out.println("Amount after Service Fee: " + totalAmountWithServiceFee);
		System.out.println("Amount after Airport Tax: " + totalAmountWithAirportTax);
	
		currentCurrencyAmount -= totalServicefee + totalAirportTax;
		
		System.out.println("After deductions: " + currentCurrencyAmount);
	
		double convertedAmount = (int)(currentCurrencyAmount * fixedRate);
		
		System.out.println("Converted currency: " + convertedAmount);
	}
	
	

}
