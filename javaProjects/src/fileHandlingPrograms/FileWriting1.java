package fileHandlingPrograms;

import java.io.File;
import java.io.FileWriter;

public class FileWriting1 {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\asqua\\Desktop\\File Handling\\xyz.txt";
		File f1 = new File(filePath);
		
		try(FileWriter fw = new FileWriter(f1);){
			fw.write('A' + "\n");
			fw.write("65"+"\n");
			fw.write('c'+"\n");
			System.out.println("File Writing is Completed!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("=========Program Ends=========");
	}
}
