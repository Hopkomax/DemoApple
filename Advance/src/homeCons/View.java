package homeCons;

import java.awt.Button;
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class View extends JFrame {
	private JPanel browserPanel = new JPanel();
	private JPanel fileList = new JPanel();
	private JScrollPane scrollPane = new JScrollPane(browserPanel);

	View() {
		// JPanel jp = new JPanel();
		setSize(1000, 500);
		fileList.setBackground(Color.black);
		// jp.setVisible(true);
		fileList.setVisible(true);

		// fileList.add(jp);
		// jp.add(new Button("ss"));

	}
}