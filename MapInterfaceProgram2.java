package collection.programs;
import java.util.HashMap;
import java.util.Map;

public class MapInterfaceProgram2 {

	public static void main(String[] args) {
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Amruta", 98);
		m1.put("Sharmin", 85);
		m1.put("Arbaz", 92);
		m1.put("Shaizad", 95);
		m1.put("Arman", 99);
		System.out.println("Map-1 elements are : " +m1);
		
		m1.replace("Amruta", 51);
		m1.replace("Sharmin", 52);
		m1.replace("Arbaz", 53);
		m1.replace("Shaizad", 54);
		m1.replace("Arman", 55);
		System.out.println("After replacing Map-1 will be : " +m1);
		
		int i1 = m1.size();
		System.out.println("Size of the Map-1 is : " +i1);
		
		boolean b1 = m1.isEmpty();
		System.out.println("Is Map-1 empty? " +b1);
		
		m1.clear();
		System.out.println("After clearing the Map-1 :" +m1);
	}
}
