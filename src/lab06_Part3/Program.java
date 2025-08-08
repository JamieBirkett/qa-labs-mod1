package lab06_Part3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			log("Test for log file");
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}

	}
	
	private static void log(String msg) throws IOException{
	File file = new File("log.txt");

	// The following will create a log.txt file;
	
	//FileWriter fw = new FileWriter(file, true); - This would work as it will create the file
	//BufferedWriter bw = new BufferedWriter(fw);
	//bw.write(msg + "\r\n");
	//bw.close();
	//fw.close();
	
	FileReader fr = new FileReader(file);
	//Exception will happen here on read if the file doesn't exist;
	fr.read(); 
	
}

}
