package collection.programs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListIntoSet {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Khadija");
		l1.add("Irfan");
		l1.add("Dawood");
		l1.add("Gauri");
		l1.add("Fauzan");
		l1.add("Irfan");
		l1.add("Fauzan");
		System.out.println("List-1 elements are : " +l1);
		
		Set<String> s1 = new HashSet<String>(l1);
		System.out.println("Set-1 elements are : " +s1);
	}
}
