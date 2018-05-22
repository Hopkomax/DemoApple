package adv03;

import javax.swing.*;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class FarManager extends JFrame{

	private JPanel browserPanel=new JPanel();
	private JPanel fileInfoPanel=new JPanel();
	private JScrollPane scrollPane=new JScrollPane(browserPanel);
	ArrayList<FileComparable> directories=new ArrayList<FileComparable>();
	ArrayList<FileComparable> files=new ArrayList<FileComparable>();
	Map<JButton, FileComparable> browserMap=new HashMap<JButton, FileComparable>();
		
	public FarManager() {
		setSize(1000, 600);		
		JPanel mainPanel=new JPanel();
		setContentPane(mainPanel);		
		mainPanel.setLayout(new GridLayout(1,2));
		browserPanel.setBackground(Color.red);		
		fileInfoPanel.setBackground(Color.green);
		mainPanel.add(scrollPane);
		mainPanel.add(fileInfoPanel);
		
		browserPanel.setLayout(new BoxLayout(browserPanel, BoxLayout.Y_AXIS));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);        
	}
	
	private class FileComparable implements Comparable<FileComparable> {
	    protected File file = null;
		public FileComparable(File file) {
	    	this.file=file;
	    }

		@Override
	    public String toString() {
	        return file.toString();
	    }

		@Override
		public int compareTo(FileComparable compare) {
			// TODO Auto-generated method stub
			return this.file.toString().toUpperCase().compareTo(compare.toString().toUpperCase());
		}
	}
	
	private void computeDirAndFilesNames(File f) throws IOException
	{
		System.out.println("computeDirAndFilesNames");		
		if(f.isDirectory()) {
			File[] list = f.listFiles();
			directories.clear();
			files.clear();
			for(File file : list) {
				if(file.isDirectory()) {
					directories.add(new FileComparable(file));
				} else {
					files.add(new FileComparable(file));					
				}				
			}
						
			Collections.sort(directories);
			Collections.sort(files);
			System.out.println("Directories");			
			for(FileComparable file : directories) {
				System.out.println(file.toString());
			}
		}
	}
	
	private void fillBrowserPanel()
	{		
		browserPanel.removeAll();
		browserPanel.revalidate();
		browserPanel.repaint();
		JButton up=new JButton("...");
		up.setSize(200, 40);
		browserPanel.add(up);
		
		for(FileComparable file : directories) {
			JButton button=new JButton(file.toString());
			browserPanel.add(button);
			browserMap.put(button, file);
			System.out.println("fillBrowserPanel::added button " + file.toString());
			
			if(file.file.isDirectory()) {
				button.addMouseListener(new MouseListener() {
				
					@Override
					public void mouseClicked(MouseEvent e) {
						if(e.getClickCount() == 2) {
							JButton btn = (JButton)e.getSource();
							FileComparable fileComparable=(FileComparable) browserMap.get(btn);
							File file=fileComparable.file;
							try {
								browseFolder(file);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}						
					}
					@Override
					public void mouseEntered(MouseEvent e) {}
					@Override
					public void mouseExited(MouseEvent e) {}
					@Override
					public void mousePressed(MouseEvent e) {}
					@Override
					public void mouseReleased(MouseEvent e) {}
				});
			}
		}	
		
		this.repaint();
	}
	
	public void browseFolder(File file) throws IOException
	{
		computeDirAndFilesNames(file);
		fillBrowserPanel();
	}	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FarManager fm=new FarManager();
		fm.setVisible(true);
		fm.browseFolder(new File("c:/"));
	}
}