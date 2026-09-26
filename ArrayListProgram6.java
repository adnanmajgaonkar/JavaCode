package collection.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(45);
		a1.add(60);
		a1.add(78);
		a1.add(450);
		System.out.println("ArrayList-1 elements are : " +a1);
		
		Iterator<Integer> i1 = a1.iterator();
		System.out.println("Iterating ArrayList using iterator : ");
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}
}
