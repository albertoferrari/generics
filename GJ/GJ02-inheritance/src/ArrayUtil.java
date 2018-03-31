/**
 * Generic method - Inheritance
 * 
 * @author Sowide lab
 */
public class ArrayUtil {

	/**
	 * Get the central element of the array
	 * @param a   Object array
	 * @return central element
	 */
	public static Object getCentral(Object[] a) {
		if (a == null || a.length == 0)
			return null;
		return (a[a.length / 2]);
	}
}
