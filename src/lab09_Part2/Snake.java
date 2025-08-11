package lab09_Part2;

public class Snake extends Animal{

	public Snake(String name) {
		super(name);
		animalType = AnimalType.Reptile;
		// TODO Auto-generated constructor stub
	}
	
	public void hiss() {
		System.out.println("Hissss");
	}
	
	
}
