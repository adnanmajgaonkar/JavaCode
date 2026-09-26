package collection.programs;
import java.util.ArrayList;

public class ArrayListProgram2 {

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
		
		System.out.println("Are ArrayList-1 and ArrayList-2 equals : "
				+(a1==a2));
	}
}
