/**
 * Generic method - Overloading
 * 
 * @author Sowide lab
 */
public class ArrayUtil {
	
	/**
	 * Get the central element of array
	 * @param a  String array
	 * @return central element
	 */
	public static String getCentral(String[] a) {
		if (a == null || a.length == 0)
			return null;
		return (a[a.length / 2]);
	}

	public static Character getCentral(Character[] a) {
		if (a == null || a.length == 0)
			return null;
		return (a[a.length / 2]);
	}

	public static Integer getCentral(Integer[] a) {
		if (a == null || a.length == 0)
			return null;
		return (a[a.length / 2]);
	}
}