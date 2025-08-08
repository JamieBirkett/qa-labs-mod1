package lab05_Part3;

import java.util.HashMap;

public class Zoo {
	HashMap<String,Integer> animalMap = null;
	
	String[] originalAnimals = {"Zebra", "Lion", "Buffalo"};
	String[] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};
	
	public Zoo() {
		this.animalMap = new HashMap<>();
		addAnimals(originalAnimals);
		addAnimals(newAnimals);
	}
	
	void addAnimals(String[] animals) {
		
		
		for(String animal : animals) {
			int count = 1;
			if(animalMap.containsKey(animal)) {
				count = animalMap.get(animal) + 1;
				animalMap.put(animal, count);
			}
			else {
				animalMap.put(animal, count);
			}
				
		}
		
	}
	
	public String displayAnimalData() {
	
		StringBuilder animalData = new StringBuilder("");
		for (String animal : animalMap.keySet()) {
			
			animalData.append(String.format("%s		%d\n", animal, animalMap.get(animal))); 
		}
		return animalData.toString();
	}
}
