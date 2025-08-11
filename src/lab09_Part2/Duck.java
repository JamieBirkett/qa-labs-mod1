package lab09_Part2;

public class Duck extends Bird {

	public Duck(String name) {
		super(name);
		animalType = AnimalType.Bird;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNest() {
		System.out.println("Ducks make a nest");
		
	}

}
