package lab08_Part2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager = new Manager("Bob", "Manager");
		Employee employee1 = new Employee("Sally","Amin");
		Employee employee2 = new Employee("Rod","IT");
		
		manager.addEmployee(employee1);
		manager.addEmployee(employee2);

		SkilledWorker skilledWorker = new SkilledWorker("John","Software Engineer");
		skilledWorker.addSkill("Java");
		skilledWorker.addSkill("JavaScript");
		
		manager.addEmployee(skilledWorker);
		
		System.out.printf(manager.getInfo());
	}

}
