package lab10a;

public class Duck extends Bird implements IFlyable, ISwimmable{

	public Duck(String name) {
		super(name);
		animalType = AnimalType.Bird;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeNest() {
		System.out.println("Ducks make a nest");
		
	}

	@Override
	public void move() {
		 System.out.println("Waddling like a Duck!");
		
	}

	@Override
	public void swim() {
		System.out.println("Swimming like a Duck!");
		
	}

	@Override
	public void fly() {
		System.out.println("Flying like a Duck!");
		
	}

}
