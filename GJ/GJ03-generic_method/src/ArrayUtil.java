/**
 * Generic method - with Generics
 * 
 * @author Sowide lab
 */
public class ArrayUtil {

	/**
	 * Get the central element of the array
	 * @param a   Object array
	 * @return central element
	 */
	public static <T> T getCentral(T[] a) {
		if (a == null || a.length == 0)
			return null;
		return (a[a.length / 2]);
	}
}
