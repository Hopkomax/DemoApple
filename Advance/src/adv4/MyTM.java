package adv4;

public class MyTM {

	public static void main(String[] args) {
		Thread thread = new Thread(()->System.out.println("Hello"));
		thread.start();
		System.out.println(Thread.activeCount());
		Runnable r= new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello");
				
			}
			
		};
		
		
	}

}
