public class Main {

	public static void main(String[] args) {
		Pair p1 = new Pair("alpha", 1);	
		// String & Integer (autoboxing) - Implicit upcasting to Object
		String name = (String) p1.getFirst();		
		// esplicit downcasting from Object to String
		Integer value = (Integer) p1.getSecond();
		System.out.println("Name: "+name+" Value: "+value);
		Pair p2 = new Pair(3.2,5.5);		// Double & Double (autoboxing)
		Double x = (Double) p2.getFirst();
		double y = (double) p2.getSecond();			// unboxing
		System.out.println("x: "+x+" y: "+y);
		x = (Double) p1.getFirst();					// run-time error
		// Exception in thread "main" java.lang.ClassCastException: java.lang.String
		// cannot be cast to java.lang.Double
	}
}