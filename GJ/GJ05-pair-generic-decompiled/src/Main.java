
public class Main {

	public static void main(String[] args) {
		
		// explicit actual type paramethers 
		Pair<String, Integer> p1 = new Pair<String, Integer>("alpha", 1);	
		String name = p1.getFirst();
		Integer value = p1.getSecond();
		System.out.println("Name: "+name+" Value: "+value);
		
		// implicit actual type paramethers 
		Pair<Double, Double> p2 = new Pair(3.2,5.5);						
		Double x = p2.getFirst();
		double y = p2.getSecond();
		System.out.println("x: "+x+" y: "+y);
		
		
		// x = p1.getFirst();	//Errore
	}
}
