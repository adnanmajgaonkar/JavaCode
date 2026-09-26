package collection.programs;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(45);
		a1.add(23.56);
		a1.add('G');
		a1.add("Automation");
		System.out.println("ArrayList elements are : " +a1);
		
		a1.add(2, "Manual");
		System.out.println("ArrayList elements are : " +a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(60);
		a2.add(55.45);
		a2.add('J');
		a2.add("Testing");
		
		
		
		a1.addAll(a2);
		System.out.println("After adding two collections : " +a1);
		
		a1.addAll(0, a2);
		System.out.println("After adding collection at 0 index : " +a1);
		
		System.out.println(a2);
		Iterator<Object> i1 = a2.iterator();
		System.out.println(i1.hasNext());
		System.out.println(i1.next());
		System.out.println(i1.hasNext());
		System.out.println(i1.next());
		
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		Iterator<Object> i2 = a1.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}
