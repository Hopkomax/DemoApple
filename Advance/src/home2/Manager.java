package home2;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Manager extends JFrame {

	private JPanel directoryPanel = new JPanel();
	private JPanel includingPanel = new JPanel();
	private JScrollPane scroll = new JScrollPane();

	public Manager() {
		setSize(500, 500);
		JPanel mainPanel = new JPanel();
		setContentPane(mainPanel);
		mainPanel.setLayout(new GridLayout(1, 2));
		directoryPanel.setBackground(Color.black);
		includingPanel.setBackground(Color.green);
		mainPanel.add(scroll);
		mainPanel.add(includingPanel);
	}

	public void Scanner() {
		File file = new File("C:/");
		File[] files = file.listFiles();

		String[] f = file.list();
		for (String ff : f) {
			System.out.println("папка");
			System.out.println(ff);
		}
		System.out.println("----------");
		for (File f1 : files) {
			if (f1.isFile()) {
				System.out.println("files");
				System.out.println(f1);
			}
		}
	}

}
