import java.util.TreeSet;
import java.util.Iterator;


public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator it = map.iterator();
        while (it.hasNext() ) {
       System.out.print( it.next() + " " );
}
 }
}


