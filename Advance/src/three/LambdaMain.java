package three;

public class LambdaMain {

	public static void main(String[] args) {
		MyInt mi = new MyInt() {

			@Override
			public void doSomething() {
				System.out.println("Hello from interface");
			}

		};
		mi.doSomething();
		
		//MyInt miL= ()->{System.out.println("HI");};
		MyInt miL= ()->{System.out.println("hi");};
		mi.doSomething();
	}
}
