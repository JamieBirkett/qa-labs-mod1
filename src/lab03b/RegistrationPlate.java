package lab03b;

public class RegistrationPlate {
	private String number, city, country, yearOfReg;

	public RegistrationPlate() {
		//Left empty as RegistrationPlateFactory 
		//will construct the RegistrationPlate
	}


	public void setNumber(String number) {
		this.number = number; 
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getYearOfReg() {
		return yearOfReg;
	}
	
	
	
}


