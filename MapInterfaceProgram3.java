package collection.programs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceProgram3 {

	public static void main(String[] args) {
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Amruta", 98);
		m1.put("Sharmin", 85);
		m1.put("Arbaz", 92);
		m1.put("Shaizad", 95);
		m1.put("Arman", 99);
		System.out.println("Map-1 elements are : " +m1);
		
		System.out.println("Iterating Map using keySet : ");
		for(String s1 : m1.keySet()) {
			System.out.println(s1);
		}
		
		System.out.println("Iterating Map using values : ");
		for(Integer i1 : m1.values()) {
			System.out.println(i1);
		}
		
		System.out.println("Iterating Map using entryset : ");
		for(Entry<String, Integer> e1 : m1.entrySet()) {
			System.out.println(e1);
		}
		
		System.out.println("Iterating Map using iterator : ");
		Set<Entry<String, Integer>> se1 = m1.entrySet();
		Iterator<Entry<String, Integer>> i2 = se1.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}
}
