package three;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class First {

	public static void main(String[] args) {

		File file = new File("hello.html");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			String text = "some text";
			fos.write(text.getBytes());
			fos.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println(file);

	}

}
