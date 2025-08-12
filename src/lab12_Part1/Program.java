package lab12_Part1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//course/trainer.txt - 1 line, use readLine and split methods
//trainerCourse - Usually done in a database (Maybe leave this)

//Extra - Check for the existence of a file e.g. File.exists
//Extra - How to append to a file
//Extra, read from JSON file (customers.JSON)

public class Program {
	public static final String File_Courses = "src/resources/course.txt";
	public static final String File_Trainer = "src/resources/trainer.txt";
	public static final String File_CoursesAndTrainers = "src/resources/courses_and_trainers.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
			String[] courses = readCSV(File_Courses);
			for (String course : courses) {
				System.out.println(course);
			}
			
			String[] trainers = readCSV(File_Trainer);
			for (String trainer : trainers) {
				System.out.println(trainer);
			}
			
			appendCsv(File_CoursesAndTrainers, courses);
			appendCsv(File_CoursesAndTrainers, trainers);
			
		}
		catch (IOException ex) {
			System.err.println(ex.getMessage());
		}
		
	}

	private static String[] readCSV(String fileName) throws IOException {
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line;
		
		while ((line = br.readLine()) != null) {
			
			return line.split(",");
		}
		return null;

	}
	
	private static void appendCsv(String fileName, String[] lines) throws IOException {
		File file = new File(fileName);
		BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

		for (String line : lines ) {
			bw.write(line);
			bw.write("\n");
		}
		bw.write("\n");
		bw.close();

	}

}
