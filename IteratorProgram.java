package collection.programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorProgram {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList("Arif", "Safwan", "Rutuja", "Aryan", "Priya"));
		System.out.println("ArrayList elements are : " +a1);
		System.out.println("Iterating ArrayList using iterator : " );
		Iterator<String> i1 = a1.iterator(); 
		int i = 0;
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the object name to search in ArrayList : ");
		String input = s1.next();
		while(i1.hasNext()) {
			String value = i1.next();
			System.out.println("Object present at index position " +i+ " is : " +value);
			if(value.equals(input)) {
				System.out.println(input + " is present in the Arraylist at index position : " +i);
			}
			i++;
		}
		
	}
}
