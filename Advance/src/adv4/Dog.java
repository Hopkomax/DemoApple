package adv4;

public class Dog {

	String name;
	int age;
	
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}
