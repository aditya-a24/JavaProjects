package fileHandlingPrograms;
import java.io.FileWriter;

public class Program3 {
	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("C:\\Users\\asqua\\Desktop\\File Handling\\abc.txt");){
			System.out.println("try block");
		}catch(Exception e) {
			System.out.println("Catch block");
		}
	}
}
