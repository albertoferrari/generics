public class GetMinArrayGeneric {
    public GetMinArrayGeneric() {}

    public <T extends Comparable<T>> T min(T a[]) {
        T min = a[0];
        for (T el:a)
        	if (el.compareTo(min) < 0)
        		min = el;
        return min;
    }
}

