import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
	public static void main(String[] args) {
		File file = new File("data.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			System.out.println("File opened successfully!");
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} finally {
			System.out.println("File operation completed.");
			if (sc != null) {
				sc.close();
				
			}
		}
	}
}
