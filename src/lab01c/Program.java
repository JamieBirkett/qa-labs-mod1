package lab01c;

//import java.util.Scanner;

public class Program {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Part 1
		theLunchQueue();
		
		/*/ part 2
		System.out.println("What is your total weight in pounds? ");
		int pounds = s.nextInt();
		convertInputToStonesPounds(pounds);
		
		//part 3
		System.out.println("What is your total weight in Kilograms? ");
		int kg = s.nextInt();
		convertKgsToStonesPounds(kg);
		*/
	}
	

	
	public static void theLunchQueue() {
		Utils utils = new Utils();
		String mainCourse = utils.getString("What main dish would you like (Fish, Burgers or Veg) ");
		int totalRoasties = utils.getInt("How many Roasties would you like? ");
		int totalBrussels = utils.getInt("How many Brussels would you like? ");
		
		System.out.printf("Hello, your lunch is %s with %d roasties and %d brussells", mainCourse, totalRoasties, totalBrussels);
	}
	
	static void convertInputToStonesPounds(int pounds) {
		
		int stone = pounds / 14;
		int remainingPounds = pounds % 14;
		
		System.out.printf("You are %d st %d lb ", stone, remainingPounds);
		
	}
	
	static void convertKgsToStonesPounds(int kg) {
		double totalPounds = kg * 2.20462;
		
		int stone = (int)totalPounds / 14;
		double remainingPounds = totalPounds % 14;
		
		System.out.printf("You are %d st %d lb ", stone, remainingPounds);
	}

}

// 