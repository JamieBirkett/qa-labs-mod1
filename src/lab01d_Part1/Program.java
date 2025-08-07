package lab01d_Part1;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,3,-5,7,0,4,6,8};
		
		//Task 1: Write code to find the sum of every number in numbers
		int sum = 0; 
		for(int number : numbers) {
			sum += number;
		}
		
		System.out.println("The sum of each number in the array is: " + sum);
		
		//Task 2: Find the average of these numbers
		int average = sum / numbers.length;
		System.out.println("The average of numbers[] is: " + average);
		
		//Task 3: Find the minimum number in numbers
		//Task 4: Find the maximum number in numbers
		int largestNumber = numbers[0];
		int smallestNumber = numbers[0];
		for(int number : numbers) {
			
			if (smallestNumber > number) {
				smallestNumber = number;
			}
			
			if (largestNumber < number) {
				largestNumber = number;
			}
			
		}
		
		System.out.println("The smallest number is: " + smallestNumber);
		System.out.println("The largest number is: " + largestNumber);
		

		//Task 5: Find the index of number zero in numbers
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                index = i;
                break; // stop once 0 is found
            }
        }
		System.out.println("The index of 0 is: " + index);
		
		//Part 2 - Calculating grades for 5 students using arrays and loop
		String[] students = {"Student 1","Student 2","Student 3","Student 4","Student 5"};
		int[] marks = {25, 55, 79, 63, 99};
		
		int i = 0;
		String grade = null; 
		while (i < marks.length) {
		
			grade = getGrade(marks[i]);
			System.out.println(students[i] + " - " + grade);
			i++;
		}
		
		

	}
	
	static String getGrade(int mark) {
		
		if (mark <= 100 && mark >= 71)
		{
			return("Distinction");
		}
		else if (mark <= 70 && mark >= 61)
		{
			return("Merit");
		}
		else if (mark <= 60 && mark >= 50)
		{
			return("Pass");
		}
		else 
		{
			return("Error: marks must be between 1..100");
		}
	}

}
