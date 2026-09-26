package collection.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(81);
		l1.add(85);
		l1.add(83);
		l1.add(82);
		l1.add(84);
		System.out.println("List-1 elements are : " +l1);
		
		int i1 = Collections.max(l1);
		System.out.println("Maximum from List-1 is : " +i1);

		int i2 = Collections.min(l1);
		System.out.println("Maximum from List-1 is : " +i2);
		
		Collections.sort(l1);
		System.out.println("After sorting List-1 is : " +l1);
		
		int i3 = Collections.binarySearch(l1, 84);
		System.out.println("binarySearch of 84 is : " +i3);
		
		int i4 = Collections.frequency(l1, 85);
		System.out.println("Frequency of 85 in List-1 is : " +i4);
	}
}
