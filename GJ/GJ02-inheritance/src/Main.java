public class Main {
	public static void main(String[] args) {
		
		String[] s = { "alpha", "beta", "charlie" };
		Character[] c = { 'h', 'a', 'l' }; // autoboxing
		Integer[] i = { 4, 8, 15, 16, 23, 42 };
		
		String sc = (String) ArrayUtil.getCentral(s);		// downcast from Object to String
		assert sc.equals("beta");
		
		Character cc = (Character) ArrayUtil.getCentral(c);
		assert cc == 'a';
		
		int ic = (int) ArrayUtil.getCentral(i);				// downcast & unboxing
		assert ic == 16;
		
		Double[] d = { 1.1, 2.3, 5.8, 13.21 };
		Double dc = (Double) ArrayUtil.getCentral(d);
		assert dc == 5.8;
		
		Integer iVar = (Integer) ArrayUtil.getCentral(c);
		// no compile-time error ->
		// run-time exception
		// Exception in thread ... java.lang.ClassCastException:
		// java.lang.Character
		// cannot be cast to java.lang.Integer ...
	}
}