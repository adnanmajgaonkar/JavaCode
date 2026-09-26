package collection.programs;
import java.util.Vector;

public class VectorProgram2 {

	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.addElement(34);
		v1.addElement(67);
		v1.addElement(88);
		System.out.println("Vector-1 elements are : " +v1);
		
		Vector<Integer> v2 = new Vector<Integer>();
		v2.addElement(54);
		v2.addElement(22);
		System.out.println("Vector-2 elements are : " +v2);
		
		v1.add(49);
		System.out.println("After adding element to Vector-1: "
		+v1);
		
		v1.add(4, 99);
		System.out.println("After adding element at index "
				+ "position 4 in Vector-1 : " +v1);
		
		v1.addAll(v2);
		System.out.println("After adding Vector-2 into Vector-1 :"
			+v1);
		
		v1.addAll(7, v2);
		System.out.println("After adding Vector-2 into Vector-1 "
				+ "at index position 7 : " +v1);
	}
}
