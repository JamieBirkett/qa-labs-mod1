package lab10a;

public abstract class Animal implements IMovable {
	AnimalType animalType;
	private String name;
	
	public Animal(String name) {
		super();
		//this.animalType = animalType;
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
