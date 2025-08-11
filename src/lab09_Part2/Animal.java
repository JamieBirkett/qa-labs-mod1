package lab09_Part2;

public abstract class Animal {
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
