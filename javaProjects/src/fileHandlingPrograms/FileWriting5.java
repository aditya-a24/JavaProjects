package fileHandlingPrograms;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileWriting5 {
	public static void main(String[] args) {

		String filePath = "C:\\Users\\asqua\\Desktop\\File Handling\\user3.txt";
		File f1 = new File(filePath);
		
		try(FileOutputStream fos = new FileOutputStream(f1, true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			Scanner sc = new Scanner(System.in);
				) {
			System.out.println("Enter the Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter the Age: ");
			int age = sc.nextInt();
			
			System.out.println("Enter the Weight: ");
			double weight = sc.nextDouble();
			
			fos.write(("Name is: "+name+"\n").getBytes());
			fos.write(("Age is: "+age+" Years\n").getBytes());
			fos.write(("Weight is: "+weight+" Kg\n").getBytes());
			fos.write("=======================================\n".getBytes());
			System.out.println("File Writing is Completed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=======Program Ends=========");
	
	}
}
