import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		GetMinArrayGeneric gmg = new GetMinArrayGeneric();

		Double d[] = { 3.4, 2.9, 11.0 };
		Integer i[] = { 2, 10, -3 };
		Character c[] = { 'b', 'a', 'z'};
		String[] s = {"alpha","beta","charlie"};
		Color[] col = { Color.RED, Color.GREEN, Color.BLUE};

		System.out.println("Min (double): " + gmg.min(d));			// implicit type
		System.out.println("Min (int): " + gmg.<Integer>min(i));	// explicit type
		System.out.println("Min (char): " + gmg.<Character>min(c));	// explicit type
		System.out.println("Min (string): " + gmg.min(s));			// implicit type
		// System.out.println("Min (color): " + gmg.min(col));			// Compile time Error: Color is not Comparable	
		
	}

}
