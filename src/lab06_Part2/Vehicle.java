package lab06_Part2;

public class Vehicle {
	
	private int speed, lane, distanceTravelled;
	private static int totalVehicals;
	private RegistrationPlate registrationPlate;
	
	public Vehicle(int speed, int lane) throws IllegalArgumentException{
		this.speed = speed;
		this.lane = lane;
		registrationPlate = RegistrationPlateFactory.getNextRegistrationPlate();
		totalVehicals++;
		
	}
	
	void accelerate(int amount) {
		int maxSpeed = 200;
		this.speed += amount;
		
		distanceTravelled += amount;
		
		if(this.speed > maxSpeed){
			this.speed = maxSpeed;
		}
		
	
	}
	
	void brake(int amount) {
		int stopped = 0;
		if(this.speed != stopped) {
			this.speed -= amount;
		}
		else {
			this.speed = stopped;
		}
		
	}
	
	static int getCount() {
		return totalVehicals;
	}
	
	String getDetails() {
		return String.format("Speed: %o %nLane: %o %nDistance Travelled: %o %nPlate: %s %n  ",this.speed, this.lane, this.distanceTravelled, registrationPlate.getNumber());
	}
	int getDistanceTravelled() {
		return distanceTravelled;
	}
	
	int getLane() {
		return lane;
	}
	
	RegistrationPlate getRegPlate() {
		return registrationPlate;
	}
	
}


