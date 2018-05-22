package three;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainNIO {

	public static void main(String[] args) {
		Path path = Paths.get("C:/Users/work/eclipse-workspace/Dota122");
		try {
			if(Files.exists(path)){
			Files.createDirectories(path);
			System.out.println("Create succes");
			}
			File file = new File(path.toString()+"Hero1.xml");
			try(FileOutputStream fos = new FileOutputStream(file)) {
				String str = "Dorou";
				fos.write(str.getBytes());
				System.out.println("Write succes");
			} catch (FileNotFoundException e) {
				System.out.println("Write unsucces");
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("Create is unsucces");
			e.printStackTrace();
		}
		

	}
}
