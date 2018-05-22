package three;

import java.io.File;

public class Mm {

	public static void main(String[] args) {
		File file = new File("C:/Users/Maksym/");
		File [] files=file.listFiles();
		for(File f:files){
			if(f.isDirectory()){
				System.out.println("f1");
				System.out.println(f);
				System.out.println("f2");
			}
		}
		System.out.println("----------");
		for(File f:files){
			if(f.isFile()){
				System.out.println("2222");
				System.out.println(f);
			}
		}
		String[] f = file.list();
		for (String ff : f) {
			System.out.println("33333");
			System.out.println(ff);
		}
	}

}
