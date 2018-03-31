/**
 * Esempio di programmazione generica mediante ereditarietà
 * @author aferrari@ce.unipr.it
 *
 */
public class ArrayUtil {
	/**
	Visualizza tutti gli elementi di un array.
	@param a array da visualizzare
	*/
	public static void printElements(Object[] a)
	{
		for (Object e : a)
			System.out.print(e + " ");
		System.out.println();
	}
}

