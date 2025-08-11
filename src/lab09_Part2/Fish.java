package lab09_Part2;

public class Fish extends Animal {

	public Fish(String name) {
		super(name);
		animalType = AnimalType.Fish;
		// TODO Auto-generated constructor stub
	}
	
	public void swim() {
		System.out.println("Fish swim");
	};

}
