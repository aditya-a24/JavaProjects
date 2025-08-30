package fileHandlingPrograms;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileWriting2 {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\asqua\\Desktop\\File Handling\\abc.txt";
		File f1 = new File(filePath);
		
		try(FileWriter fw = new FileWriter(f1, true);
				Scanner sc = new Scanner(System.in);){
			
			System.out.println("Enter the Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter the Age: ");
			int age = sc.nextInt();
			
			System.out.println("Enter the Weight: ");
			double weight = sc.nextDouble();
			
			fw.write("Name is: "+name+"\n");
			fw.write("Age is: "+age+" Years\n");
			fw.write("Weight is: "+weight+" Kg\n");
			fw.write("===========================\n");
			System.out.println("File writing is Completed");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("===========Program Ends============");
	}
}
