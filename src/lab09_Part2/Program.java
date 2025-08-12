package lab09_Part2;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
	
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Duck("Mallard"));
		animals.add(new Fish("Cod"));
		animals.add(new Penguin("Emporer Penguin"));
		animals.add(new Snake("Cobra"));

		
		for (Animal animal : animals) {
			System.out.println("Animal: " + animal.getName());
			System.out.println("Animal Type: " + animal.animalType);
			if (animal instanceof Bird bird) {
				bird.makeNest();
			}
			else if(animal instanceof Fish fish) {
				fish.swim();
			}
			else if(animal instanceof Snake snake) {
				snake.hiss();
			}
			System.out.println();
			
		}
	}

}
