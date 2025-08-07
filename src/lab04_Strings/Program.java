package lab04_Strings;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Part 2 Using String
		String name = "Phillip";
		
		System.out.println(name.charAt(2));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		for(char character : name.toCharArray()) {
			System.out.printf("%s	", character);
		}
		
		System.out.println();
		
		System.out.println(name.startsWith("P"));
		System.out.println(name.endsWith("i"));
		
		System.out.println(name.indexOf("l"));
		System.out.println(name.indexOf("x"));
		
		String fullName = name + " " + "Phillipson";
		
		System.out.println(fullName);
		
		
		//Part 3 Using StringBuilder
		
		StringBuilder sb = new StringBuilder("Bruce Springsteen ");
		
		sb.append("is the artist ever");
		System.out.println(sb.toString());
		
		sb.insert(25, "greatest ");
		
		System.out.println(sb.toString());
		
		sb.replace(34, 40, "singer");
		System.out.println(sb.toString());
		
	}

}
