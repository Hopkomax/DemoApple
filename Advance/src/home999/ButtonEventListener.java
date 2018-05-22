package home999;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ButtonEventListener implements ActionListener {

	
	String first = "Мясника вызывали?";
	String second = "Дело в шляпе!";
	String third = "Так много мяса, так мало времени.";

	// Phrase(String say){
	// this.say=say;
	// }
	public String getInfo() {
		return say;
	}

	public String setInfo(String say) {
		return this.say = say;

	}

	Scanner scanner = new Scanner(System.in);
	String say;

	void setInfo() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String lan = "";
		String country = "";
		if (PudgeGG.button_ua.isSelected()) {
			lan = "ua";
			country = "UA";
		} else if (PudgeGG.button_de.isSelected()) {
			lan = "de";
			country = "DE";
		} else if (PudgeGG.button_en.isSelected()) {
			lan = "en";
			country = "EN";
		}
		Locale locale = new Locale(lan, country);
		ResourceBundle rs = ResourceBundle.getBundle("MessageBundle", locale);

		String message1 = "";
		String message2 = "";
		String message3 = "";
		message1 = rs.getString("greeting1");
		message2 = rs.getString("greeting2");
		message3 = rs.getString("greeting3");

		PudgeGG.label1.setText(message1);
		PudgeGG.label2.setText(message2);
		PudgeGG.label3.setText(message3);

		/*
		 * if (scanner.hasNextInt()) { switch (scanner.nextInt()) {
		 * 
		 * case 1: say = setInfo(first); System.out.println("1");
		 * //PudgeG.button_ua.addActionListener(new ButtonEventListener());
		 * break;
		 * 
		 * case 2: //PudgeG.button_de.addActionListener(new
		 * ButtonEventListener()); say = setInfo(second);
		 * System.out.println("2"); break; case 3:
		 * //PudgeG.button_en.addActionListener(new ButtonEventListener()); say
		 * = setInfo(third); System.out.println("3"); break; } }
		 */
	}

}
