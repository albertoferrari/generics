//Post-JDK 1.5 with Generics
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPostJDK15Test {
public static void main(String[] args) {
   ArrayList<String> lst = new ArrayList<String>();  //Inform compiler about type
   lst.add("alpha");         // compiler checks if argument's type is String
   lst.add("beta");
   lst.add("charlie");
   System.out.println(lst);  // [alpha, beta, charlie]

   Iterator<String> iter = lst.iterator();   // Iterator of Strings
   while (iter.hasNext()) {
      String str = iter.next();  // compiler inserts downcast operator
      System.out.println(str);
   }

   // lst.add(new Integer(1234));   // ERROR: compiler can detect wrong type
								 // error: no suitable method found for add(Integer)
   // Integer intObj = lst.get(0);  // ERROR: compiler can detect wrong type
								 // error: incompatible types: String cannot be converted to Integer

   // Enhanced for-loop (JDK 1.5)
   for (String str : lst) {
      System.out.println(str);
   }
}
}