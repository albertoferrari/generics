/**
 * Esempio di metodo generico che restituisce un oggetto generico
 * @author aferrari@ce.unipr.it
 *
 */
public class GetMinGeneric
{
    public GetMinGeneric() {}

    /**
     * Restituisce il minimo fra oggetti comparabili
     * @param a,b,c valori
     * @return valore minimo
     */
    public <T extends Comparable<T>> T min(T a, T b, T c) {
        T min = a;
        if (b.compareTo(min) < 0)
            min = b;
        if (c.compareTo(min) < 0)
            min = c;
         return min;
    }

}