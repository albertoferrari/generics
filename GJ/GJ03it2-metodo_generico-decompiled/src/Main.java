import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		GetMinGeneric gmg = new GetMinGeneric();

		Double d[] = { 3.4, 2.9, 11.0 };
		Integer i[] = { 2, 10, -3 };
		Character c[] = { 'b', 'a', 'z'};
		Color[] col = { Color.RED, Color.GREEN, Color.BLUE};

		System.out.println("Min (double): " + gmg.min(d[0], d[1], d[2]));			// passaggio implicito del tipo
		System.out.println("Min (int): " + gmg.<Integer>min(i[0], i[1], i[2]));		// passaggio esplicito del tipo
		System.out.println("Min (char): " + gmg.<Character>min(c[0], c[1], c[2]));	// passaggio esplicito del tipo
		
		// System.out.println("Min (char): " + gmg.<Color>min(col[0], col[1], col[2]));	// Error: Color is not Comparable
	}

}