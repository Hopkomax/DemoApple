package adv4;

import java.util.Comparator;
import java.util.TreeSet;
public class MainDog {

	public static void main(String[] args) {
		Dog dog1 = new Dog("b",4);
		Dog dog2 = new Dog("a",2);
		//DogComparator dc=new DogComparator();
		
		Comparator<Dog> dc= new Comparator<Dog>() {

			@Override
			public int compare(Dog o1, Dog o2) {
				
				return o1.age > o2.age ? 1 : -1;
			}
			
		};
		TreeSet <Dog> set=new TreeSet<Dog>((o1,o2)->o1.age > o2.age ? 1 : -1);
		//TreeSet <Dog> set=new TreeSet();
		
		set.add(dog1);
		set.add(dog2);
		System.out.println(set);
		
        //System.out.println(dog1.toString());
       // System.out.println(dog2.toString());
	}

}
