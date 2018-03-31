/**
 * Pair of objects
 * @author SoWIDE lab
 *
 */
public class Pair {
	private Object first;
	private Object second;

	/**
	 * Constructs a pair containing two given elements
	 * @param firstElement the first element
	 * @param secondElement the second element
	 */
	public Pair(Object firstElement, Object secondElement) {
		first = firstElement;
		second = secondElement;
	}

	/**
	 * Gets the first element of this pair
	 * @return the first element
	 */
	public Object getFirst() {
		return first;
	}

	/**
	 * Gets the second element of this pair
	 * @return the second element
	 */
	public Object getSecond() {
		return second;
	}

	public String toString() {
		return "(" + first + ", " + second + ")";
	}
}