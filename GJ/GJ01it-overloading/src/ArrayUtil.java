/**
 * Esempio di overloading per programmazione generica
 * @author aferrari@ce.unipr.it
 *
 */
public class ArrayUtil {
	/**
	Visualizza tutti gli elementi di un array.
	@param a array di stringhe visualizzare
	*/
	public static void printElements(String[] a)
	{
		for (String e : a)
			System.out.print(e + " ");
		System.out.println();
	}
	/**
	Visualizza tutti gli elementi di un array.
	@param a array di interi visualizzare
	*/
	public static void printElements(Integer[] a)
	{
		for (Integer e : a)
			System.out.print(e + " ");
		System.out.println();
	}	
	/**
	Visualizza tutti gli elementi di un array.
	@param a array di caratteri visualizzare
	*/
	public static void printElements(Character[] a)
	{
		for (Character e : a)
			System.out.print(e + " ");
		System.out.println();
	}	
}

