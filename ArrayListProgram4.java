package collection.programs;
import java.util.ArrayList;

public class ArrayListProgram4 {

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
		
		a1.remove(0);
		System.out.println("After removing the object at index position 0 "
				+ "from ArrayList-1 : " 
				+a1);
		
		a1.addAll(a2);
		System.out.println("After adding ArrayList-2 into ArrayList-1 : "
				+a1);
		
		a1.removeAll(a2);
		System.out.println("After removing ArrayList-2 from ArrayList-1 : "
				+a1);
		
		ArrayList<String> a3 = new ArrayList<String>();
		a3.add("Manish");
		a3.add("Saqlain");
		a3.add("Reena");
		a3.add("Kavya");
		System.out.println("ArrayList-3 elements are : " +a3);
		
		a3.remove("Reena");
		System.out.println("After removing the object from ArrayList-3 : "
				+a3);
	}
}
