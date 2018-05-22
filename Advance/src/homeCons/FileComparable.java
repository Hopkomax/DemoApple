package homeCons;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

public class FileComparable implements Comparable<FileComparable> {

	 protected File file = null;
		public FileComparable(File file) {
	    	this.file=file;
		}
	
	
		@Override
	    public String toString() {
	        return file.toString();
	    }

	@Override
	public int compareTo(FileComparable o) {
		// TODO Auto-generated method stub
		return 0;
	}

	private void computerDirectories(File f) throws IOException {
		System.out.println("computerDirectories");
		if(f.isDirectory()) {
			File[] list = f.listFiles();
			directories.clear();
			files.clear();
			for(File files: list) {
				if(file.isDirectory()) {
					directories.add(new FileComparable(file));
				}else {
					files.add(new FileComparable(file));
					
				}
			}
			
			Collections.sort(directions);
			Collections.sort(files);
			System.out.println("Directories");
			for(FileComparable file: directories) {
				System.out.println(file.toString());
			}
			
		}
	}
	private void fillBrowserPanel() {
		browserPanel.removeAll();
		browserPanel.revalidae();
		browserPanel.repaint();
		
	}
	
}
