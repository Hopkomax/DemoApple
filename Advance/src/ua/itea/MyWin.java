package ua.itea;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWin extends JFrame {
	JLabel label = new JLabel(new ImageIcon("fish.jpg"));

	MyWin() {
		super("Maven project");
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
