package lab06_Part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Vehicle> vehicles = new ArrayList<>();
		
		
		String[] regPlates = RegistrationPlateFactory.getRegistartionPlates();
		int lane = 1;
		for(String regPlate : regPlates ) {
			
			vehicles.add(new Vehicle(0,lane++));
		}
		
		//Cause an exception here by adding more vehicles than regPlates
		try {
		vehicles.add(new Vehicle(0,regPlates.length + 1));
		}
		catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
			return;
		}
		
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getDetails());
		}
		
		System.out.println("Total Vehicles: " + Vehicle.getCount());
		
	
		int finishLine = 1000;
		int distanceTravelled = 0;
		
		Random rand = new Random();
		
		while(distanceTravelled < finishLine) {
			for(Vehicle vehicle : vehicles) {
				int acceleration = rand.nextInt(10)+1;
				int brake = rand.nextInt(10)+1;
				
				vehicle.accelerate(acceleration);
				vehicle.brake(brake);
				
				distanceTravelled = vehicle.getDistanceTravelled();
				System.out.println(vehicle.getDetails());
				
				if (distanceTravelled >= finishLine) {
					System.out.println("The winner is " + vehicle.getRegPlate().getNumber() + " in lane: " + vehicle.getLane());
					break;
				}

			}
		}
		
	}

}
