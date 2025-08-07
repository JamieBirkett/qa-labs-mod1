package lab03b;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Vehicle(0,1));
		vehicles.add(new Vehicle(0,2));
		vehicles.add(new Vehicle(0,3));
		
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
