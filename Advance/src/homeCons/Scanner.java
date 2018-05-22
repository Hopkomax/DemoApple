package homeCons;

import java.io.File;

public class Scanner {
	
	File file = new File("C:/");
	File[] files = file.listFiles();

	void sortFiles(){
	String[] f = file.list();
	for(String ff:f)
	{
		System.out.println("папка");
		System.out.println(ff);
	}System.out.println("----------");
	
	
	for(File f1:files)
	{
		if (f1.isFile()) {
			System.out.println("files");
			System.out.println(f1);
		
			
		}
	}
}
	
	void addButtons() {
		
		
		
	}
}