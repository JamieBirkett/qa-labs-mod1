package Lab08_Part2;

import java.util.ArrayList;

public class Manager extends Employee{
	private ArrayList<Employee> employees;
	public Manager(String name, String jobTitle) {
		super(name, jobTitle);
		this.employees = new ArrayList<>();
		
	}


	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	
	@Override
	public String getInfo() {
		String info = super.getInfo();
		 
		 for (Employee emp : employees) {
			 info += emp.getInfo();
		 }
		 
		 return info;
		// Need to finish this and do Extra module
	}

	
}
