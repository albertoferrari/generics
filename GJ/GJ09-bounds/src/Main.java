import java.util.Arrays;
import java.util.List;

public class Main {

	public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    return s;
	}
	
	public static double productOfList(List<Number> list) {
	    double p = 1.0;
	    for (Number n : list)
	        p *= n.doubleValue();
	    return p;
	}
	
	public static void printList(List<?> list) {
	    for (Object elem: list)
	        System.out.print(elem + " ");
	    System.out.println();
	}
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));
		//System.out.println("product = " + productOfList(li));
		// The method productOfList(List<Number>) in the type Main is not applicable for the arguments (List<Integer>)	
		List<String> sli =Arrays.asList("alpha","beta");
		// System.out.println("sum = " + sumOfList(sli)); 
		// COMPILE TIME ERROR 
		// The method sumOfList(List<? extends Number>) in the type Main 
		// is not applicable for the arguments (List<String>) ...
		List gli = Arrays.asList("alpha","beta");;
		// System.out.println("sum = " + sumOfList(gli));
		// Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Number
	}

}
