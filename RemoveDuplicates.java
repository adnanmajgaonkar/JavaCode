package collection.programs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(87);
		a1.add(null);
		a1.add(34);
		a1.add(null);
		a1.add(65);
		a1.add(34);
		a1.add(65);
		
		System.out.println("Before removing duplicates : " + a1);
		
		Set<Integer> s1 = new HashSet<Integer>(a1);
		
		System.out.println("After converting List into Set : " +s1);
	}
}
