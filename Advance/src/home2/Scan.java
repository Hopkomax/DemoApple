package home2;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Scan {

	void getFileNameFromFolder() {
		public static JRadioButton button=new JRadioButton();
		
		
		File file = new File("C:/");
		File [] files=file.listFiles();
	//	@SuppressWarnings("resource")
		//Scanner scanner = new Scanner(System.in);
		//if (scanner.hasNext()) {
			//String way = scanner.nextLine();
			//File folder = new File(way);
		//	File[] listOfFiles = folder.listFiles();
			
			//Arrays.sort(listOfFiles[]);
		//	for (int i = 0; i < listOfFiles.length; i++) {
			
		//		System.out.println(listOfFiles[i].getName());
		//	}
			String[] f = file.list();
					for (String ff : f) {
				System.out.println("папка");
				System.out.println(ff);
		}
			System.out.println("----------");
				for(File f1:files){
				if(f1.isFile()){
					System.out.println("files");
					System.out.println(f1);
				}
			}
				JButton button=new JButton(file.toString());
			//	button.
	}
}

