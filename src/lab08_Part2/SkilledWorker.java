package lab08_Part2;

import java.util.ArrayList;

public class SkilledWorker extends Employee {

	private ArrayList<String> skills;
	
	public SkilledWorker(String name, String jobTitle) {
		super(name, jobTitle);
		this.skills = new ArrayList<String>();
	}

	public void addSkill(String skill) {
		skills.add(skill);
	};
	
	public ArrayList<String> getSkills() {
		return skills;
	}

	@Override
	public String getInfo() {
		String info = super.getInfo();

		info += "Skills: | ";
		 
		for (String skill : skills) {
			
			info +=  skill + " | ";
	
		} 
		
		return info + "\n";
	}

}
