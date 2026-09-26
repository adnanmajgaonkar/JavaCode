package collection.programs;
import java.util.Scanner;

public class ASCIIValue {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first String : ");
		String s1 = s.next();
		System.out.print("Enter second String : ");
        String s2 = s.next();

        System.out.println("ASCII values of string: " + s1);
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            System.out.println(ch + " = " + (int) ch);
        }

        System.out.println("\nASCII values of string: " + s2);
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            System.out.println(ch + " = " + (int) ch);
        }
	}
}
