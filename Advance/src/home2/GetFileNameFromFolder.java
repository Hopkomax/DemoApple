package home2;

import java.io.File;

//public class GetFileNameFromFolder {

//	public void getFileNameFromFolder(){
	String folderName = null;
		//	TestFolder tf=new TestFolder();
		File folder = new File(folderName);
		File[] listOfFiles=folder.listFiles();
		for(int i=0; i<listOfFiles.length;i++){
			System.out.println(listOfFiles[i].getName());
		}
			
		
	}
	
	
}
