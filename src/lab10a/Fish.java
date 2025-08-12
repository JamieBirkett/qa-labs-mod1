package lab10a;

public class Fish extends Animal implements ISwimmable {

	public Fish(String name) {
		super(name);
		animalType = AnimalType.Fish;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void swim() {
		System.out.println("Swimming like a Fish!");
	}

	@Override
	public void move() {
		System.out.println("Moving like a Fish!");
		
	};

}
