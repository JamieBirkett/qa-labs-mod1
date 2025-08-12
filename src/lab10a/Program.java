package lab10a;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Duck("Mallard"));
		animals.add(new Fish("Cod"));
		animals.add(new Penguin("Emporer Penguin"));
		animals.add(new Snake("Cobra"));

		
		for (Animal animal : animals) {
			System.out.println("Animal: " + animal.getName());
			System.out.println("Animal Type: " + animal.animalType);

			if(animal instanceof ISwimmable swimmableAnimal) {
				swimmableAnimal.swim();
			}
			else if(animal instanceof IFlyable flyableAnimal) {
				flyableAnimal.fly();
			}
			else if(animal instanceof IMovable movableAnimal) {
				movableAnimal.move();
			}
			System.out.println();
			
		}
	}

}
