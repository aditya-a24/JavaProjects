package fileHandlingPrograms;

import java.io.File;

public class Program5 {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\asqua\\Desktop\\File Handling\\pqr.txt";
		File f1 = new File(filePath);
		try {
			// create new file if its not Exists
			if(f1.createNewFile()){
				System.out.println("File is created");				
			}else {
				System.out.println("File already exists");
			}
		}catch(Exception e) {
			System.out.println("File not created!");
			System.out.println(e.getMessage());
		}
		System.out.println("============Program Ends===============");
	}
}
