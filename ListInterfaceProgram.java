package collection.programs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterfaceProgram {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(56);
		li.add(45);
		li.add(87);
		li.add(95);
		li.add(21);
		System.out.println("List-1 elements are : " +li);
		
		li.add(1, 99);
		System.out.println("After adding element at index position 1 : "
		+li);
		
		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(33);
		li1.add(69);
		li1.add(77);
		li1.add(39);
		li1.add(44);
		System.out.println("List-2 elements are : " +li1);
		
		li.addAll(li1);
		System.out.println("After adding List-2 elements into List-1 : "
		+li);
		
		li1.addAll(0, li);
		System.out.println("After adding List-1 elements into List-2"
				+ " at index position 0 : "
				+li1);
		
		boolean b1 = li.equals(li1);
		System.out.println("Is List-1 equals to List-2 : " +b1);
		
		boolean b2 = li.contains(95);
		System.out.println("Is List-1 contains 95 : " +b2);
		
		boolean b3 = li.containsAll(li1);
		System.out.println("Is List-1 contains List-2 : " +b3);
		
		System.out.println("In List-1 element present on "
				+ "index position 0 is : " +li.get(7));
		
		System.out.println("Index position of 33 in List-1 is : " 
		+li.indexOf(33));
		
		System.out.println("Size of the List-1 is : " +li.size());
		
		System.out.println("Iterating List-1 using Iterator : ");
		Iterator<Integer> i1 = li.iterator();
		int i = 0;
		while(i1.hasNext()) {
			System.out.println("Object at index position " +i+ " is : "
					+ i1.next());
			i++;
		}
		
		System.out.println("Iterating List-1 in forward direction"
				+ " using ListIterator : ");
		ListIterator<Integer> i2 = li.listIterator();
		int j = 0;
		while(i2.hasNext()) {
			System.out.println("Object at index position " +j+ " is : "
					+ i2.next());
			j++;
		}
		
		System.out.println("Iterating List-1 in backward direction"
				+ " using ListIterator : ");
		ListIterator<Integer> i3 = li.listIterator();
		int k = 0;
		while(i2.hasPrevious()) {
			System.out.println("Object at index position " +k+ " is : "
					+ i2.previous());
			k++;
		}
		
		li.remove(1);
		System.out.println("After removing object at index position 1 : "
				+li);
		
		li1.removeAll(li);
		System.out.println("After removing List-1 from List-2 : " +li1);
		
		li1.clear();
		System.out.println("After clearing the List-2 : " +li1);
	}
}
