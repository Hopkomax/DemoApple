package home999;



import java.awt.Container;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class PudgeGG extends JFrame {
	public static JRadioButton button_ua = new JRadioButton("UA");
	public static JRadioButton button_de = new JRadioButton("DE");
	public static JRadioButton button_en = new JRadioButton("EN");
	static JLabel label1 = new JLabel();
	static JLabel label2 = new JLabel();
	static JLabel label3 = new JLabel();
	@SuppressWarnings("unused")
	private Icon img = new ImageIcon("pudge.png");
	private JLabel l1 = new JLabel();
	private Image im = new ImageIcon(this.getClass().getResource("pudge.png"))
			.getImage();

	public PudgeGG() {
		super("Test");
		this.setBounds(0, 0, 600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = this.getContentPane();
		// container.setLayout(new GridLayout(3, 3, 3, 2));
		container.setLayout(null);

		ButtonGroup group = new ButtonGroup();
		group.add(button_ua);
		group.add(button_de);
		group.add(button_en);

		container.add(button_ua);
		button_ua.setBounds(450, 60, 50, 25);
		container.add(button_de);
		button_de.setBounds(450, 110, 50, 25);
		container.add(button_en);
		button_en.setBounds(450, 160, 50, 25);

		 button_ua.addActionListener(new ButtonEventListener());
		 button_de.addActionListener(new ButtonEventListener());
		 button_en.addActionListener(new ButtonEventListener());

	
		container.add(label1);
		label1.setBounds(70, 250, 500, 25);
		container.add(label2);
		label2.setBounds(70, 270, 500, 25);
		container.add(label3);
		label3.setBounds(70, 290, 500, 25);
		l1.setIcon(new ImageIcon(im));
		// l1.setSize(20,65);
		container.add(l1);
		l1.setBounds(70, 60, 128, 128);
	}

	// PudgeG();
	// public class ButtonEventListener implements ActionListener {
	/*
	 * public void actionPerformed(ActionEvent e) { String lan = ""; String
	 * country = ""; if (button_ua.isSelected()) { lan = "ua"; country = "UA"; }
	 * else if (button_de.isSelected()) { lan = "de"; country = "DE"; } else if
	 * (button_en.isSelected()) { lan = "en"; country = "EN"; } Locale locale =
	 * new Locale(lan, country); ResourceBundle rs =
	 * ResourceBundle.getBundle("MessageBundle", locale);
	 * 
	 * String message1 = ""; String message2 = ""; String message3 = "";
	 * message1 = rs.getString("greeting1"); message2 =
	 * rs.getString("greeting2"); message3 = rs.getString("greeting3");
	 * 
	 * label1.setText(message1); label2.setText(message2);
	 * label3.setText(message3);
	 * 
	 * 
	 * }
	 */
}
