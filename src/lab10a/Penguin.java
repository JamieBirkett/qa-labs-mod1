package lab10a;

public class Penguin extends Bird implements ISwimmable{

	public Penguin(String name) {
		super(name);
		animalType = AnimalType.Bird;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNest() {
		System.out.println("Penguins make nests from pebbles");
		
	}

	@Override
	public void move() {
		System.out.println("Waddling like a Penguin!");
		
	}

	@Override
	public void swim() {
		System.out.println("Swimming like a Penguin!");
		
	}

}
