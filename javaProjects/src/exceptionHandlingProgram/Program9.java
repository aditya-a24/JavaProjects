package exceptionHandlingProgram;

import java.io.File;
import java.io.IOException;

public class Program9 {
	public static void main(String[] args) {
		String path = "f:\\abc.txt";
		File f1 = new File(path);
		
		try {
			f1.createNewFile();
			System.out.println("File is Created");
		} catch (Exception e) {
			System.out.println("File is not Created");
			System.out.println(e.getMessage()); 
			e.printStackTrace(); // java.io.IOException
		}
		System.out.println("===========Program Ends===========");
	}
}
