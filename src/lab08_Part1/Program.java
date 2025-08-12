package lab08_Part1;

import java.util.ArrayList;

public class Program {

	static ArrayList<Car> cars = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Car car1 = new Car("Honda", 115);
		Car car2 = new Car("Audi", 120);
		Car car3 = new Car("VW", 105);
		
		RacingCar racingCar1 = new RacingCar("Ferrari", 140, "Driver 1", 5);
		RacingCar racingCar2 = new RacingCar("Mercedes", 135, "Driver 2", 7);
		RacingCar racingCar3 = new RacingCar("McLaren", 155, "Driver 3", 10);
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(racingCar1);
		cars.add(racingCar2);
		cars.add(racingCar3);
		
		processCars();
	}


	static void processCars() {
		StringBuilder sb = new StringBuilder("Car Details: \n---------------\n");
		
		for(Car car : cars) {

			car.getToSixty();
			car.accelerate(2);
			
			int speed = car.getSpeed();
			String model = car.getModel();
			
			sb.append("Model: %s \nSpeed: %d \n");
			
			int turboFactor = 0;
					
			if (car instanceof RacingCar racingCar) {
				
				speed = racingCar.getSpeed();
				turboFactor = racingCar.getTurboFactor();
				
				sb.append();
			//	String racingCarDetails = String.format("Turbo Factor &d \n", turboFactor);
				
			}
			
			System.out.printf(String.format("\nModel: %s \nSpeed: %d \nTurbo Factor %d \n", model, speed, turboFactor));
		}
	
	}
}