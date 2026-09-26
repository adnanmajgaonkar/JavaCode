package collection.programs;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListProgram7 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(45);
		a1.add(60);
		a1.add(78);
		a1.add(450);
		System.out.println("ArrayList-1 elements are : " +a1);
		
		ListIterator<Integer> li1 = a1.listIterator();
		System.out.println("Forward iteration using LisIterator : ");
		while(li1.hasNext()) {
			System.out.println(li1.next());
		}
		
		System.out.println("Backward iteration using LisIterator : ");
		while(li1.hasPrevious()) {
			System.out.println(li1.previous());
		}
	}
}
