package CollectionP;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v2 = new Vector();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add("Aarti");
        v.add("Sneha");
        v.add("Sneha");

        v2.add(10);
        v2.add(20);
        v2.add(30);

        System.out.println("Vector element " +v);
        System.out.println(v.capacity());
        System.out.println(v.add("Rammya"));
        System.out.println(v.contains(40));
        System.out.println(v.elementAt(4));
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.get(6));
        System.out.println(v.equals(v2));
        System.out.println(v.isEmpty());
        System.out.println(v.remove("Rammya"));
        System.out.println(v.set(2, 30));
        System.out.println(v.subList(1,3));

        Iterator i1 = v.iterator();
        while (i1.hasNext()){
            System.out.println("vector Iterator using iterator: "+i1.next());
        }

        for (int i=0; i<v.size(); i++){
            System.out.println("vector Iterator using for lopp : "+v.get(i));
        }

    }
}
