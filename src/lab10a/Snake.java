package lab10a;

public class Snake extends Animal{

	public Snake(String name) {
		super(name);
		animalType = AnimalType.Reptile;
		// TODO Auto-generated constructor stub
	}
	
	public void hiss() {
		System.out.println("Hissss");
	}

	@Override
	public void move() {
		System.out.println("Slithering like a Snake!");
		
	}
	
	
}
