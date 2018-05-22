package three;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pudge {

	public static void main(String[] args) {
		// Path pathToCopy=Paths.get("C:/Users/Maksym/workspace");
		// Path pathCopy=Paths.get("C:/Users/Maksym/workspace");

		Path p = Paths.get("C:/Users/Maksym/workspace/Dota22");
		File file = new File(p.toUri());
		file.mkdir();

		// File file = new File("hello.html");

		try {
			FileOutputStream fos = new FileOutputStream(file);
			String text = "Fresh meat";
			fos.write(text.getBytes());
			fos.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println(file);
	}

}
