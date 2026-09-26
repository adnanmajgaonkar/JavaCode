package collection.programs;
import java.util.ArrayList;

public class ArrayListProgram5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(45);
		a1.add(60);
		a1.add(78);
		a1.add(450);
		System.out.println("ArrayList-1 elements are : " +a1);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(77);
		a2.add(895);
		a2.add(90);
		a2.add(56);
		System.out.println("ArrayList-2 elements are : " +a2);
		
		System.out.println("Size of ArrayList-1 : " +a1.size());
		System.out.println("Size of ArrayList-1 : " +a2.size());
		
		System.out.println("Get object at index position 2 from ArrayList-1 :"
				+ " " +a1.get(2));
		System.out.println("Get object at index position 2 from ArrayList-2 :"
				+ " " +a2.get(2));
		
		System.out.println("Checking ArrayList-1 contains element 60 : " 
		+a1.contains(60));
		System.out.println("Checking ArrayList-1 contains element 100 : " 
		+a1.contains(100));
		System.out.println("Checking ArrayList-2 contains element 77 : " 
		+a1.contains(77));
		System.out.println("Checking ArrayList-2 contains element 100 : " 
		+a1.contains(100));
		
		System.out.println("Before adding checking ArrayList-1 contains "
				+ "ArrayList-2 : " 
				+a1.containsAll(a2));
		
		a1.addAll(a2);
		System.out.println("After adding ArrayList-2 into ArrayList-1 : " 
		+a1);
		
		System.out.println("After adding checking ArrayList-1 contains "
				+ "ArrayList-2 : " 
				+a1.containsAll(a2));
	}
}
