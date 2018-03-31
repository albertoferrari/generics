import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayListPreJDK5Test {
   public static void main(String[] args) {
      ArrayList lst = new ArrayList();  // ArrayList contains instances of Object
      lst.add("alpha"); // add() takes Object. String upcast to Object implicitly
      lst.add("beta");
      lst.add("charlie");
      lst.add(new Integer(10));		//Integer upcast to Object implicitly
      System.out.println(lst);     // [alpha, beta, charlie, 10]

      Iterator iter = lst.iterator();
      while (iter.hasNext()) {      
		//explicitly downcast from Object to String (*)
         String str = (String)iter.next();  // ERROR	
         System.out.println(str);
      }
   }
}