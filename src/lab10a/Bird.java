package lab10a;

public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
		animalType = AnimalType.Bird;
		// TODO Auto-generated constructor stub
	}
	
	public abstract void makeNest();

}
