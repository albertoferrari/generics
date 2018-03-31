public class Main {
	public static void main(String[] args) {
		
		String[] s = { "alpha", "beta", "charlie" };
		Character[] c = { 'h', 'a', 'l' };
		Integer[] i = { 4, 8, 15, 16, 23, 42 };
		Double[] d = { 1.1, 2.3, 5.8, 13.21 };
		
		String sc = ArrayUtil.getCentral(s);				// implicit type (String) parameter
		assert sc.equals("beta");
		System.out.println(sc);
		
		Character cc = ArrayUtil.<Character> getCentral(c);	// esplicit type (Character) parameter
		assert cc == 'a';
		System.out.println(cc);
		
		int ic = ArrayUtil.getCentral(i);					// implicit type parameter & unboxing
		assert ic == 16;
		System.out.println(ic);
		
		Double dc = ArrayUtil.getCentral(d);
		assert dc == 5.8;
		System.out.println(dc);
		// Integer iVar = ArrayUtil.getCentral(c);
		// compile-time error: incompatible types
	}
}