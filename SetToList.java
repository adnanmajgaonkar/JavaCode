package collection.programs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetToList {

	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(null);
		s1.add(65);
		s1.add(87);
		s1.add(23);
		s1.add(11);
		System.out.println("Set elements are : " +s1);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(s1);
		a1.add(0, null);
		a1.add(2, 65);
		
		System.out.println("After coverting Set into List : " +a1);
	}
}
