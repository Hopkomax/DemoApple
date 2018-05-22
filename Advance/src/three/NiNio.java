package three;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NiNio {

	public static void main(String[] args)  {
		Path path = Paths.get("C:/Users/Maksym/a1");
		Path path2=Paths.get("C:/Users/Maksym/a1");
		//path.getFileSystem();
		//System.out.println(path.getNameCount());
		//System.out.println(path.getFileName());
		//System.out.println(path.getRoot());
		//Files.copy(path, path2);

		/*Path pathToCopy=Paths.get("C:/Users/Maksym/a1");
		Path pathCopy=Paths.get("C:/Users/Maksym/a1/a2");
		try {
			Files.copy(pathToCopy, pathCopy);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OK");
		*/
		Path p = Paths.get("C:/Users/Maksym/a1/new 1");
		//File file=new File(p.toUri());
		//file.mkdir();
		System.out.println("ok");
		
		try{
			Files.createDirectory(p);
		}catch
		
		//Files.createDirectory(path, "te.text");
		
	}

}
