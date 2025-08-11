package lab09_Part2;

public class Penguin extends Bird {

	public Penguin(String name) {
		super(name);
		animalType = AnimalType.Bird;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNest() {
		System.out.println("Penguins make nests from pebbles");
		
	}

}
