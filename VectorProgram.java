package collection.programs;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorProgram {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>();
		v1.add("Apple");
		v1.add("Banana");
		v1.add("Chickoo");
		System.out.println("Vector element are : " +v1);
		
		v1.add(3, "PineApple");
		System.out.println("After adding element at index position 3 : " +v1);
		
		System.out.println("Capacity of the Vector is : " +v1.capacity());
		
		System.out.println("Is Vector contains Banana? : " 
		+v1.contains("Banana"));
		
		System.out.println("Is Vector empty? " +v1.isEmpty());
		
		System.out.println();
		System.out.println("Iterating Vector using Iterator : ");
		Iterator<String> i1 = v1.iterator();
		int i = 0;
		while(i1.hasNext()) {
			System.out.println("Element at index position " +i+ " is : "
					+i1.next());
			i++;
		}
		System.out.println();
		System.out.println("Iterating Vector using ListIterator "
				+ "in forward direction : ");
		ListIterator<String> i2 = v1.listIterator();
		int j = 0;
		while(i2.hasNext()) {
			System.out.println("Element at index position " +j+ " is : "
					+i2.next());
			j++;
		}
		System.out.println();
		System.out.println("Iterating Vector using ListIterator "
				+ "in backward direction : ");
		int k = 0;
		while(i2.hasPrevious()) {
			System.out.println("Element at index position " +k+ " is : "
					+i2.previous());
			k++;
		}
		System.out.println();
		System.out.println("Iterating Vector using Enumeration : ");
		Enumeration<String> e1 = v1.elements();
		int l = 0;
		while(e1.hasMoreElements()) {
			System.out.println("Element at index position " +l+ " is : "
					+e1.nextElement());
			l++;
		}
	}
}
