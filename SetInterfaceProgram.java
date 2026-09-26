package collection.programs;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceProgram {

	public static void main(String[] args) {
		
		Set<String> s1 = new HashSet<String>();
		s1.add("Shreya");
		s1.add("Adil");
		s1.add("Hanzala");
		s1.add("Parvin");
		s1.add("Vidya");
		System.out.println("Set-1 elements are : " +s1);
		
		Set<String> s2 = new HashSet<String>();
		s2.add("Pankaj");
		s2.add("Rameez");
		s2.add("Saima");
		System.out.println("Set-2 elements are : " +s2);
		
		s1.addAll(s2);
		System.out.println("After adding Set-2 int Set-1 : " +s1);
		
		System.out.println("Is Set-1 contains Saima : " 
		+s1.contains("Saima"));
		
		System.out.println("Is Set-1 contains all Set-2 elements : "
				+s1.containsAll(s2));
		
		System.out.println("Is Set-1 is equal to Set-2 : "
				+s1.equals(s2));
		
		System.out.println("Is Set-1 empty : " +s1.isEmpty());
		
		System.out.println("Size of the Set-1 is : " +s1.size());
		
		System.out.println("Iterating Set using Iterator : ");
		Iterator<String> i1 = s1.iterator();
		int i = 0;
		while(i1.hasNext()) {
			System.out.println("Object at index position " +i+
					" is : " +i1.next());
			i++;
		}
		
		s1.remove("Adil");
		System.out.println("Set-1 after removing Adil : " +s1);
		
		s1.removeAll(s2);
		System.out.println("After removing Set-1 from Set-2 : " 
				+s1);
		
		s1.clear();
		System.out.println("After clearing the Set-1 : " +s1);
	}
}
