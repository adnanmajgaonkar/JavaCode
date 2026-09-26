package collection.programs;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

	public static void main(String[] args) {
		
		HashSet<Double> h1 = new HashSet<Double>();
		h1.add(45.67);
		h1.add(93.34);
		h1.add(23.35);
		h1.add(88.44);
		h1.add(98.22);
		System.out.println("HasSet elements are : " +h1);
		
		System.out.println("Iterating HasSet using iterator : ");
		Iterator<Double> i1 = h1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}
