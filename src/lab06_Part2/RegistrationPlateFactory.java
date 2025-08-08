package lab06_Part2;

public class RegistrationPlateFactory {
	
	private static String[] registrationPlates = {
	"LA05 XYZ", // London
	"NG58 JKL", // Nottingham
	"MA13 HYP", // Manchester
	"BX06 TUV", // Birmingham
	"CF67 QRS", // Cardiff
	"YS09 PQR", // Yorkshire
	"WD21 NML", // Exeter
	"KR16 FGH", // Northampton
	"SJ04 UVW", // Glasgow
	"LV22 ABC", // Liverpool
	"WX19 XYZ"  // Bristol
	};
	
	private static int plateIndex;
	
	static RegistrationPlate getNextRegistrationPlate() throws IllegalArgumentException {
		
		if (plateIndex >= registrationPlates.length) {
			//System.out.println("All plates have been used");
			throw new IllegalArgumentException("Error: No registartion plates remaining");
			//return null;
			
		}
		
		String registration = registrationPlates[plateIndex];
		
		RegistrationPlate myRegPlate = new RegistrationPlate();
		myRegPlate.setNumber(registration);
		plateIndex++;
		
		return myRegPlate;
	}
	
	static String[] getRegistartionPlates() {
		return registrationPlates;
	}

}
