public class Main {
	public static void main(String[] args) {
		String[] s = { "alpha", "beta", "charlie" };
		Character[] c = { 'h', 'a', 'l' };			// autoboxing
		Integer[] i = { 4, 8, 15, 16, 23, 42 };
		String sc = ArrayUtil.getCentral(s);
		assert sc.equals("beta");
		Character cc = ArrayUtil.getCentral(c);
		assert cc == 'a';
		int ic = ArrayUtil.getCentral(i);			// unboxing
		assert ic == 16;
				
		/*
		Double[] d = { 1.1, 2.3, 5.8, 13.21 };
		Double dc = ArrayUtil.getCentral(d);
		// compile time error:
		// no suitable method found for getCentral(Double[])
		assert dc == 5.8;
		*/
	}
}