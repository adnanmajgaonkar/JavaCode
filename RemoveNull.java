package collection.programs;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveNull {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(87);
		a1.add(null);
		a1.add(34);
		a1.add(null);
		a1.add(65);
		
		System.out.println("Before removing null : " +a1);
		
		Iterator<Integer> i1 = a1.iterator();
		while(i1.hasNext()) {
			if(i1.next()==null) {
				i1.remove();
			}
		}
		System.out.println("After removing null : " +a1);
	}
}
