/**
 * Esempio di metodo generico
 * @author aferrari@ce.unipr.it
 *
 */
public class ArrayUtil {
	/**
	Visualizza tutti gli elementi di un array.
	@param a array da visualizzare
	*/
	public static <T> void printElements(T[] a)
	{
		for (T e : a)
			System.out.print(e + " ");
		System.out.println();
	}
}

