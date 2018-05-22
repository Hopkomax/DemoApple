package base;

public class Lamp {

	boolean state;
	int britenes;
	
	
	void on() {
		state= true;
		britenes=100;
	}
	void off() {
		state=false;
		britenes=0;
	}
	void getInfo() {
		System.out.println("state"+state+"britenes"+britenes);
	}
	
}
