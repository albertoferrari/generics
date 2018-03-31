
public class Main {

	public static void main(String[] args) {
		Container<Integer> c = new Container();
		Integer i = 10;
		String s = "this is a string";
		c.setElement(i);
		Integer i2 = c.getElement();
		// c.setElement(s);
		// Compile time error
		//Main.java:10: error: method setElement in class Container<E> cannot be applied to given types;
	}

}
