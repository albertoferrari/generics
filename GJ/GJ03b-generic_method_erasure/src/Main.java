public class Main {
	public Main() {
	}

	public static void main(String args[]) {
		String s[] = { "alpha", "beta", "charlie" };
		Character c[] = { Character.valueOf('h'), Character.valueOf('a'),
				Character.valueOf('l') };
		Integer i[] = { Integer.valueOf(4), Integer.valueOf(8),
				Integer.valueOf(15), Integer.valueOf(16), Integer.valueOf(23),
				Integer.valueOf(42) };
		Double d[] = { Double.valueOf(1.1000000000000001D),
				Double.valueOf(2.2999999999999998D),
				Double.valueOf(5.7999999999999998D),
				Double.valueOf(13.210000000000001D) };
		String sc = (String) ArrayUtil.getCentral(s);
		if (!$assertionsDisabled && !sc.equals("beta"))
			throw new AssertionError();
		Character cc = (Character) ArrayUtil.getCentral(c);
		if (!$assertionsDisabled && cc.charValue() != 'a')
			throw new AssertionError();
		int ic = ((Integer) ArrayUtil.getCentral(i)).intValue();
		if (!$assertionsDisabled && ic != 16)
			throw new AssertionError();
		Double dc = (Double) ArrayUtil.getCentral(d);
		if (!$assertionsDisabled && dc.doubleValue() != 5.7999999999999998D)
			throw new AssertionError();
		else
			return;
	}

	static final boolean $assertionsDisabled = false;
}
