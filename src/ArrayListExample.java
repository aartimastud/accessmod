import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add("Aarti");
        list2.add(20);
        list2.add(40);
        System.out.println(list1);
        System.out.println(list1.get(1));
        System.out.println(list1.remove(1));
        System.out.println(list1.size());
        System.out.println(list1.set(2,20));
        System.out.println(list1);
        System.out.println(list1.contains("Aarti"));
        System.out.println(list1.clone());
        System.out.println(list1.indexOf("Aarti"));
        System.out.println(list1.equals(list2));
        System.out.println(list1.isEmpty());
        System.out.println(list1.lastIndexOf("Aarti"));
        System.out.println(list1.subList(1,3));

        //using iterator
        Iterator i1 = list1.iterator();
        while (i1.hasNext()){
            System.out.println("List Iterator "+i1.next());
        }

        //using for loop
        for (int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }
    }
}
