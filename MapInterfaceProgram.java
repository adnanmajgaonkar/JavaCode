package collection.programs;
import java.util.HashMap;
import java.util.Map;

public class MapInterfaceProgram {

	public static void main(String[] args) {
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Amruta", 98);
		m1.put("Sharmin", 85);
		m1.put("Arbaz", 92);
		System.out.println("Map-1 elements are : " +m1);
		
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("Shaizad", 95);
		m2.put("Arman", 99);
		System.out.println("Map-2 elements are : " +m2);
		
		m1.putAll(m2);
		System.out.println("After adding Map-2 into Map-1 : " +m1);
		
		boolean b1 = m1.equals(m2);
		System.out.println("Is Map-1 and Map-2 are equal : " +b1);
		
		boolean b2 = m1.containsKey("Sharmin");
		System.out.println("Is Map-1 contains key as Sharmin : " +b2);
		
		boolean b3 = m1.containsValue(85);
		System.out.println("Is Map-1 contains value as 85 : " +b3);
	}
}
