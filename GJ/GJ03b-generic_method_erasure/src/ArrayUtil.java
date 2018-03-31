public class ArrayUtil {
    public ArrayUtil() {}

    /**
     * Restituisce l'elemento centrale dell'array
     * @param a array generico
     * @return valore minimo
     */
    public static Object getCentral(Object a[]) {
        if (a == null || a.length == 0)
        	return null;
        return a[a.length/2];
    }
}

