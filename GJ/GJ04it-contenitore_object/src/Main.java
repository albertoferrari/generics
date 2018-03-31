
public class Main {

	public static void main(String[] args) {
		Container c = new Container();
		Integer i = 10;
		String s = "this is a string";
		c.setElement(i);
		Integer i2 = (Integer) c.getElement();
		assert i2 == 10;
		c.setElement(s);
		// Integer i3 = (Integer) c.getElement();
		// Run time error
		// Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		// at Main.main(Main.java:11)
	}

}
